package com.example.ayiquiz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Respuestas {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Long idQ;
    private String eleccion;
    private boolean esCorrecta;



}
