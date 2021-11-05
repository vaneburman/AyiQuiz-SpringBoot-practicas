package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.model.Pregunta;
import com.example.ayiquiz.services.JugadorService;
import com.example.ayiquiz.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class CentralController {

    //jugadores
    @Autowired
    JugadorService jugadorService;

    @Autowired
    Jugador jugador;

    //preguntas
    @Autowired
    PreguntasService preguntasService;

    @Autowired
    Pregunta preguntas;

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/ingresar")
    public String agregarJugador(Model model) {
        model.addAttribute("jugador", jugador);
        return "saveJugador";
    }

    @PostMapping("/quiz")
    public String confirmarJugador(String nombre, String apellido, String userName, Model model){
        jugadorService.saveJugador(nombre, apellido, userName);

        return "redirect:/quiz";
    }


    @GetMapping("/quiz")
    public String getPreguntas (Model model) {
        if(jugador.getUserName()==""){
            return "redirect:/";
        }
        model.addAttribute("conjuntoPreguntas", preguntasService.getConjuntoPreguntas());

        return "quiz";

    }

  /*  @PostMapping("/submit")
    public String guardarRespuestas()


*/
}
