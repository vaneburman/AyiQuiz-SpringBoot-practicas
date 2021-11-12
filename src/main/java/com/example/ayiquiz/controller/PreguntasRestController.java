package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Pregunta;
import com.example.ayiquiz.services.PreguntasService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PreguntasRestController {

    @Autowired
    private PreguntasService preguntasService;

    @Autowired
    Pregunta pregunta;

    @GetMapping("/preguntas")
    public ResponseEntity<String> getPreguntas() {
        try {
            List<Pregunta> preguntas = preguntasService.retrievePreguntas();

            ObjectMapper mapper = new ObjectMapper();
            String preguntasJson = mapper.writeValueAsString(preguntas);

            return ResponseEntity.ok(preguntasJson);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @GetMapping("/preguntas/{id}")
    public ResponseEntity<String> getPregunta(@PathVariable Long id) {
       try {
            Pregunta pregunta = preguntasService.getPreguntas(id).orElse(null);
            ObjectMapper mapper = new ObjectMapper();
            String preguntaJson = mapper.writeValueAsString(pregunta);
            return ResponseEntity.ok(preguntaJson);
       } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
       }
    }

    @PostMapping("/preguntas")
    public ResponseEntity<String> addPregunta(@RequestBody Pregunta pregunta) {
        try {
            preguntasService.savePregunta(pregunta.getIdQ(), pregunta.getPregunta(), pregunta.getPuntos());
            return ResponseEntity.ok("Pregunta agregada correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/preguntas/{id}")
    public ResponseEntity<String> updatePregunta(@PathVariable Long id, @RequestBody String pregunta, Integer puntos, Long idQ) {
        try {
            preguntasService.getPreguntas(id).ifPresent(preguntas -> {
                preguntas.setPregunta(pregunta);
                preguntas.setPuntos(puntos);
                preguntas.setIdQ(idQ);
            });
            Optional<Pregunta> preg = preguntasService.getPreguntas(id);
            preguntasService.updatePregunta(preg.orElse(null));
            return ResponseEntity.ok("Pregunta actualizada correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/preguntas/{id}")
    public ResponseEntity<String> deletePregunta(@PathVariable Long id) {
        try{
        preguntasService.deletePregunta(id);
        return ResponseEntity.ok("Pregunta eliminada correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }







}
