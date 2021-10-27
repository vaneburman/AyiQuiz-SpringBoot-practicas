package com.example.ayiquiz.controller;


import com.example.ayiquiz.model.Preguntas;
import com.example.ayiquiz.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PreguntasController {

    @Autowired
    PreguntasService preguntasService;

    @Autowired
    Preguntas preguntas;

    @ModelAttribute("preguntas")
    public Preguntas getPreguntas() {
        return preguntas;
    }

    @GetMapping("/quiz")
    public String getPreguntas (Model model) {

        model.addAttribute("conjuntoPreguntas", preguntasService.getConjuntoPreguntas());

        return "quiz";

    }

    @PostMapping("/submit")
    public String getSubmitPage(){
        //colocar en los controladores de las respuestas
        return "submit";
    }
}
