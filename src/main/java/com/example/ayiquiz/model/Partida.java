package com.example.ayiquiz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PARTIDA")
    private Long idPartida;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Jugador jugador;

    @OneToMany
    private Set<Pregunta> listaPreguntas;

}
