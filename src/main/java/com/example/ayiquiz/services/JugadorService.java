package com.example.ayiquiz.services;

import com.example.ayiquiz.model.Jugador;

import java.util.List;


public interface JugadorService {


    List<Jugador> retrieveJugadores();

    Jugador getJugador(String jugadorId);

    void saveJugador(String nombre, String apellido, String userName);

    void deleteJugador(String jugadorId);

    void updateJugador(Jugador jugador);
}
