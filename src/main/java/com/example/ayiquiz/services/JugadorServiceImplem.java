package com.example.ayiquiz.services;

import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.repositories.JugadorDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JugadorServiceImplem implements JugadorService{

        @Autowired
        private JugadorDAO jugadorDAO;

        @Autowired
        Jugador jugador;


        public List<Jugador> retrieveJugadores(){
            return jugadorDAO.findAll();
        }

        //arreglar!!!
       public Jugador getJugador(String jugadorID){
           return jugadorDAO.findById(jugadorID);

        }


    public void saveJugador(String nombre, String apellido, String userName){
            jugador.setNombre(nombre);
            jugador.setApellido(apellido);
            jugador.setUserName(userName);
            jugadorDAO.save(jugador);
        }


    public void deleteJugador(String jugadorID){
        jugadorDAO.deleteById(jugadorID);
        }
        public void updateJugador (Jugador jugador){
            jugadorDAO.save(jugador);
        }


}
