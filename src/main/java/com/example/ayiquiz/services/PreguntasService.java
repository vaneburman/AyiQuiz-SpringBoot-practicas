package com.example.ayiquiz.services;

import com.example.ayiquiz.model.ConjuntoPreguntas;
import com.example.ayiquiz.model.Opcion;
import com.example.ayiquiz.model.Pregunta;

import java.util.List;
import java.util.Optional;

public interface PreguntasService {

    List<Pregunta> retrievePreguntas();

    ConjuntoPreguntas getConjuntoPreguntas();

    Optional<Pregunta> getPreguntas(Long preguntasID);

    void savePregunta(String pregunta, Integer puntos, List<Opcion> opciones);

    void deletePregunta(Long preguntasID);

    void updatePregunta(Pregunta pregunta);
}
