package com.example.ayiquiz.model;

import lombok.*;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Component
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String nombre;
    private String apellido;
    private String userName;

    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Partida> partidas;
    }

