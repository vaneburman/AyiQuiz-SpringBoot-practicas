package com.example.ayiquiz.services;

import com.example.ayiquiz.model.Jugador;

import java.util.List;
import java.util.Optional;


public interface JugadorService {


    List<Jugador> retrieveJugadores();

    Optional<Jugador> getJugador(Long jugadorID);

    void saveJugador(String nombre, String apellido, String userName);

    void deleteJugador(Long jugadorID);

    void updateJugador(Long id, Jugador jugador);
}
