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
    public String home(Model model) {
        model.addAttribute("jugador", jugador);
        return "saveJugador";
    }

    @PostMapping("/quiz")
    public String quiz(String nombre, String apellido, String userName, Model model){
        jugadorService.saveJugador(nombre, apellido, userName);

        return "redirect:/quiz";
    }

    @GetMapping("/cambiar")
    public String cambiarJugador(){
        return "saveJugador";
    }

    @PostMapping("/agregar")
    public String guardarJugador(Jugador jugador){
        jugadorService.updateJugador(jugador);
        return "redirect:/agregar";

    }



}
