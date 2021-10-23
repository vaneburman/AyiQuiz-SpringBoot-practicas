package com.example.ayiquiz.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Component
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQ;

    @Column
    private String pregunta;
    @Column
    private String opcion1;
    @Column
    private String opcion2;
    @Column
    private String opcion3;
    @Column
    private String opcionCorrecta;

}
