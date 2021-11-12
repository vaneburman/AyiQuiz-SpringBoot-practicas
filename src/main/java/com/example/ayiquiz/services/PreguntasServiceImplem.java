package com.example.ayiquiz.services;

import com.example.ayiquiz.model.ConjuntoPreguntas;
import com.example.ayiquiz.model.Opcion;
import com.example.ayiquiz.model.Pregunta;
import com.example.ayiquiz.repositories.JPAPreguntasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntasServiceImplem implements PreguntasService {

    @Autowired
    JPAPreguntasDAO preguntasDAO;

    @Autowired
    Pregunta preguntas;

    @Autowired
    ConjuntoPreguntas conjuntoPreguntas;


    @Override
    public List<Pregunta> retrievePreguntas() {
        return preguntasDAO.findAll();
    }

    @Override
    public Optional<Pregunta> getPreguntas(Long preguntasID) {
        return preguntasDAO.findById(preguntasID);
    }

    @Override
    public void savePregunta(Long idQ, String pregunta, Integer puntos) {
        preguntas.setPregunta(pregunta);
        preguntas.setPuntos(puntos);
        preguntas.setIdQ(idQ);
        preguntasDAO.save(preguntas);

    }

    @Override
    public void deletePregunta(Long preguntasID) {
        preguntasDAO.deleteById(preguntasID);

    }

    @Override
    public void updatePregunta(Pregunta pregunta) {
        preguntasDAO.save(pregunta);

    }


    public ConjuntoPreguntas getConjuntoPreguntas() {
        List<Pregunta> listaPreguntas = preguntasDAO.findAll();

        conjuntoPreguntas.setListado(listaPreguntas);

        return conjuntoPreguntas;
    }
}
