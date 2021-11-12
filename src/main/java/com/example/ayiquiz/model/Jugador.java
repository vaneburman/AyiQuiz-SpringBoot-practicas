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
    @Column(name = "ID_JUGADOR")
    private Long idJugador;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name="USERNAME")
    private String userName;

    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Partida> partidas;
    }

