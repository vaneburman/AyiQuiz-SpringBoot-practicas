package com.example.ayiquiz.controller;
import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping(path="/jugador")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @Autowired
    Optional<Jugador> jugador;


    @GetMapping("/agregar")
    public String home(Model model) {
        model.addAttribute("jugador", jugador);
        return "saveJugador";
    }

    @PostMapping(path="/quiz")
    public String addJugador(@ModelAttribute Jugador jugador){
        jugadorService.saveJugador(jugador.getNombre(), jugador.getApellido(), jugador.getUserName());
        return "redirect:/quiz";
    }


    @GetMapping(path="/edit/{id}")
    public String updateJugador(@PathVariable Long id) {
        //encontrar jugador con id
        jugador = jugadorService.getJugador(id);
        jugador.ifPresent(value -> jugadorService.updateJugador(id, value));

        return "redirect:/saveJugador";
    }

    /*@PostMapping("/agregar")
    public String guardarJugador(Long id, Jugador jugador){
        jugadorService.updateJugador(jugador);
        return "redirect:/agregar";

    }*/



}
