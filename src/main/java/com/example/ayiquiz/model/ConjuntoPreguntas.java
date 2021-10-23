package com.example.ayiquiz.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConjuntoPreguntas {

    private List<Preguntas> listado;

    public List<Preguntas> getListado() {
        return listado;
    }

    public void setListado(List<Preguntas> listado){
        this.listado = listado;
    }
}
