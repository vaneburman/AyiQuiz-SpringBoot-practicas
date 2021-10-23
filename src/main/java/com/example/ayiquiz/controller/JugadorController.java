package com.example.ayiquiz.controller;


import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/jugador")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @Autowired
    Jugador jugador;

    @ModelAttribute("jugador")
    public Jugador getJugador(){
        return jugador;
    }


    @GetMapping("/agregar")
    public String home() {
        return "saveJugador";
    }

    @GetMapping("/cambiar")
    public String cambiarJugador(){ return "saveJugador"; }

    /*@PostMapping("/quiz")
    public String quiz(String nombre, String apellido, String userName, Model model) {
        if (jugador.getUserName() == null) {
            jugadorService.saveJugador(nombre, apellido, userName);
            model.addAttribute("nombre", nombre);
        } else {
            jugador.setNombre(nombre);
            jugador.setApellido(apellido);
            jugador.setUserName(userName);
            jugadorService.updateJugador(jugador);
        }
        return "quiz";
    }*/


}
