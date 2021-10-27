package com.example.ayiquiz.services;

import com.example.ayiquiz.model.ConjuntoPreguntas;
import com.example.ayiquiz.model.Preguntas;
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
    Preguntas preguntas;

    @Autowired
    ConjuntoPreguntas conjuntoPreguntas;


    @Override
    public List<Preguntas> retrievePreguntas() {
        return preguntasDAO.findAll();
    }

    @Override
    public Optional<Preguntas> getPreguntas(Long preguntasID) {
        return preguntasDAO.findById(preguntasID);
    }

    @Override
    public void savePregunta(String pregunta, String opcion1, String opcion2, String opcion3, String OpcionCorrecta) {
        preguntas.setPregunta(pregunta);
        preguntas.setOpcion1(opcion1);
        preguntas.setOpcion2(opcion2);
        preguntas.setOpcion3(opcion3);
        preguntas.setOpcionCorrecta(OpcionCorrecta);

        preguntasDAO.save(preguntas);

    }

    @Override
    public void deletePregunta(Long preguntasID) {
        preguntasDAO.deleteById(preguntasID);

    }

    @Override
    public void updatePregunta(Preguntas pregunta) {
        preguntasDAO.save(pregunta);

    }


    public ConjuntoPreguntas getConjuntoPreguntas() {
        List<Preguntas> listaPreguntas = preguntasDAO.findAll();

        conjuntoPreguntas.setListado(listaPreguntas);

        return conjuntoPreguntas;
    }
}
