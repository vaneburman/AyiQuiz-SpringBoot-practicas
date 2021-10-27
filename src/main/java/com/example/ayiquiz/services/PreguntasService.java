package com.example.ayiquiz.services;

import com.example.ayiquiz.model.ConjuntoPreguntas;
import com.example.ayiquiz.model.Preguntas;

import java.util.List;
import java.util.Optional;

public interface PreguntasService {

    List<Preguntas> retrievePreguntas();

    ConjuntoPreguntas getConjuntoPreguntas();

    Optional<Preguntas> getPreguntas(Long preguntasID);

    void savePregunta(String pregunta, String opcion1, String opcion2, String opcion3, String OpcionCorrecta);

    void deletePregunta(Long preguntasID);

    void updatePregunta(Preguntas pregunta);
}
