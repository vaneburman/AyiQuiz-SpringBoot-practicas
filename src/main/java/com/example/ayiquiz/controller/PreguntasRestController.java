package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Pregunta;
import com.example.ayiquiz.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PreguntasRestController {

    @Autowired
    private PreguntasService preguntasService;

    @Autowired
    Pregunta pregunta;
/*

    @GetMapping("/preguntas")
    public List<Pregunta> getPreguntas(){
        return preguntasService.retrievePreguntas();
    }

    @PostMapping("/preguntas")
    public void postPreguntas(@RequestBody Pregunta preguntas){
        preguntasService.savePregunta(preguntas.getPregunta(), preguntas.getOpcion1(), preguntas.getOpcion2(), preguntas.getOpcion3(), preguntas.getOpcionCorrecta());
    }

    @PutMapping("/preguntas/{id}")
    public void putPreguntas(@PathVariable Long id, @RequestBody Pregunta preguntas){
        preguntasService.savePregunta(preguntas.getPregunta(), preguntas.getOpcion1(), preguntas.getOpcion2(), preguntas.getOpcion3(), preguntas.getOpcionCorrecta());
    }

    @DeleteMapping
    public void deletePreguntas(Long id){
        preguntasService.deletePregunta(id);
    }

*/



}
