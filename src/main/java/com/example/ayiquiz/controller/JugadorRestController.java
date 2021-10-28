package com.example.ayiquiz.controller;

import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
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

/*    @PostMapping("/jugador/{id}")*/

    @GetMapping("/list")
    public List<Jugador> listarJugadores(){
        return jugadorService.retrieveJugadores();
    }

    @GetMapping("/{id}")
    public Optional<Jugador> obtenerJugador(@PathVariable("id") Long id){
        return jugadorService.getJugador(id);
    }

    @PostMapping("/add")
    public void agregarJugador(@RequestBody String nombre, String apellido, String userName){
        jugadorService.saveJugador(nombre, apellido, userName);
    }

    @PutMapping("/{id}")
    public void actualizarJugador(@PathVariable("id") Long id, @RequestBody String nombre, String apellido, String userName)
    {
            Optional<Jugador> jugadorOpc = jugadorService.getJugador(id);
            if(jugadorOpc.isPresent()){
                Jugador jugador = jugadorOpc.get();
                jugador.setNombre(nombre);
                jugador.setApellido(apellido);
                jugador.setUserName(userName);
                jugadorService.updateJugador(jugador);
            } else {
                System.out.println("No se encontró el ID del jugador");
            }

    }

    @DeleteMapping("/{id}")
    public void eliminarJugador(@PathVariable("id") Long id){
            jugadorService.getJugador(id);
            jugadorService.deleteJugador(id);
    }





}

