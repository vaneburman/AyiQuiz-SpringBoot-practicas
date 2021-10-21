package com.example.ayiquiz.repositories;

import com.example.ayiquiz.model.Jugador;

import java.util.List;


public interface JugadorDAO {

    List<Jugador> findAll();

    Jugador findById(String jugadorID);

    void save(Jugador jugador);

    void deleteById(String jugadorID);
}
