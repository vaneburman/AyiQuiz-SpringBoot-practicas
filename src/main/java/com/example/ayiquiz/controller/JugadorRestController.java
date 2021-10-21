package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class JugadorRestController {

    @Autowired
    private JugadorService jugadorService;

    @Autowired
    Jugador jugador;

    public void setJugadorService(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @GetMapping("/api/jugadores")
    public List<Jugador> getJugadores() {
        return jugadorService.retrieveJugadores();
    }



}

