package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Preguntas;
import com.example.ayiquiz.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PreguntasRestController {

    @Autowired
    private PreguntasService preguntasService;

    @Autowired
    Preguntas preguntas;

    @GetMapping("/preguntas")
    public List<Preguntas> getPreguntas(){
        return preguntasService.retrievePreguntas();
    }

    @PostMapping("/preguntas")
    public void postPreguntas(@RequestBody Preguntas preguntas){
        preguntasService.savePregunta(preguntas.getPregunta(), preguntas.getOpcion1(), preguntas.getOpcion2(), preguntas.getOpcion3(), preguntas.getOpcionCorrecta());
    }

    @PutMapping("/preguntas/{id}")
    public void putPreguntas(@PathVariable Long id, @RequestBody Preguntas preguntas){
        preguntasService.savePregunta(preguntas.getPregunta(), preguntas.getOpcion1(), preguntas.getOpcion2(), preguntas.getOpcion3(), preguntas.getOpcionCorrecta());
    }

    @DeleteMapping
    public void deletePreguntas(Long id){
        preguntasService.deletePregunta(id);
    }




}
