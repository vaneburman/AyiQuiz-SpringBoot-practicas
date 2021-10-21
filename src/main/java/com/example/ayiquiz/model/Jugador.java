package com.example.ayiquiz.model;

import org.springframework.stereotype.Component;
import javax.persistence.*;

@Entity
@Component
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nombre;
    private String apellido;
    private String userName;


    public Jugador(String id, String nombre, String apellido, String userName) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
    }

    public Jugador() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
