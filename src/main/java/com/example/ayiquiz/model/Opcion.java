package com.example.ayiquiz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Opcion {
    @Id
    @Column(name = "ID_OPCION", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idQ", nullable=false)
    private Pregunta pregunta;

    @Column(name = "OPCION", nullable = false)
    private String opcion;

    @Column(name = "ES_CORRECTA", nullable = false)
    private boolean esCorrecta;

    @Column(name="ES_SELECCIONADA")
    boolean esSeleccionada;


}
