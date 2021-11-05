package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.services.JugadorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path="/api")
public class JugadorRestController {

    @Autowired
    private JugadorService jugadorService;

    @Autowired
    Jugador jugador;

    public void setJugadorService(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    //response entity

    @GetMapping("/jugadores")
    public ResponseEntity<String> getAllJugadores() {
        try {
            List<Jugador> lista = jugadorService.retrieveJugadores();

        ObjectMapper mapper = new ObjectMapper();

        String listaRta = mapper.writeValueAsString(lista);

        return ResponseEntity.ok(listaRta);
        }
        catch (Exception e) {
            e.printStackTrace();
            String error = "Error al obtener los jugadores " + e.getMessage() + " " + e.getCause();

            return ResponseEntity.badRequest().body(error);
        }

    }

    @GetMapping("/jugadores/{id}")
    public ResponseEntity<String> getJugadorById(@PathVariable("id") Long id) {
        try {
            Optional<Jugador> jugador = jugadorService.getJugador(id);
            ObjectMapper mapper = new ObjectMapper();
            String jugadorRta = mapper.writeValueAsString(jugador);
            return ResponseEntity.ok(jugadorRta);
        }
        catch (Exception e) {
            e.printStackTrace();
            String error = "Error al obtener el jugador " + e.getMessage() + " " + e.getCause();
            return ResponseEntity.badRequest().body(error);
        }
    }

    @PostMapping("/jugadores")
    public ResponseEntity<String> createJugador(@RequestBody Jugador jugador) {
        try {
            jugadorService.saveJugador(jugador.getNombre(), jugador.getApellido(), jugador.getUserName());
            return ResponseEntity.ok("Jugador creado");
        }
        catch (Exception e) {
            e.printStackTrace();
            String error = "Error al crear el jugador " + e.getMessage() + " " + e.getCause();
            return ResponseEntity.badRequest().body(error);
        }
    }

    @PutMapping("/jugadores/{id}")
    public ResponseEntity<String> updateJugador(@PathVariable("id") Long id, @RequestBody Jugador jugador) {
        try {
            jugadorService.updateJugador(id, jugador);
            return ResponseEntity.ok("Jugador actualizado");
        }
        catch (Exception e) {
            e.printStackTrace();
            String error = "Error al actualizar el jugador " + e.getMessage() + " " + e.getCause();
            return ResponseEntity.badRequest().body(error);
        }
    }

    @DeleteMapping("/jugadores/{id}")
    public ResponseEntity<String> deleteJugador(@PathVariable("id") Long id) {
        try {
            jugadorService.deleteJugador(id);
            return ResponseEntity.ok("Jugador eliminado");
        }
        catch (Exception e) {
            e.printStackTrace();
            String error = "Error al eliminar el jugador " + e.getMessage() + " " + e.getCause();
            return ResponseEntity.badRequest().body(error);
        }
    }

    }


