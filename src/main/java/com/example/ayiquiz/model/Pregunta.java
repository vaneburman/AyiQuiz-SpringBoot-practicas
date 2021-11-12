package com.example.ayiquiz.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Component
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQ;

    @Column(name = "PREGUNTA")
    private String pregunta;

    @Column(name="PUNTOS")
    private Integer puntos;

    @OneToMany(mappedBy = "pregunta")
    @ToString.Exclude
    private List<Opcion> opciones;


  
}
