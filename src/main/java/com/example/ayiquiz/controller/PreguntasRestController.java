package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Preguntas;
import com.example.ayiquiz.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PreguntasRestController {

    @Autowired
    private PreguntasService preguntasService;

    @Autowired
    Preguntas preguntas;




}
