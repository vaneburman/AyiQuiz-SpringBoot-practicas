package com.example.ayiquiz.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConjuntoPreguntas {

    private List<Pregunta> listado;

    public List<Pregunta> getListado() {
        return listado;
    }

    public void setListado(List<Pregunta> listado){
        this.listado = listado;
    }
}
