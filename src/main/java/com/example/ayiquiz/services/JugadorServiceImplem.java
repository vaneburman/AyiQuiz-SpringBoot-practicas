package com.example.ayiquiz.services;

import com.example.ayiquiz.model.Jugador;
import com.example.ayiquiz.repositories.JPAJugadorDAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JugadorServiceImplem implements JugadorService{

        @Autowired
        private JPAJugadorDAO jugadorDAO;

        @Autowired
        Jugador jugador;


        public List<Jugador> retrieveJugadores(){
            return jugadorDAO.findAll();
        }

        //arreglar!!!
       public Optional<Jugador> getJugador(Long jugadorID){
           return jugadorDAO.findById(jugadorID);

        }


    public void saveJugador(String nombre, String apellido, String userName){
            jugador.setNombre(nombre);
            jugador.setApellido(apellido);
            jugador.setUserName(userName);
            jugadorDAO.save(jugador);
        }


    public void deleteJugador(Long jugadorID){
        jugadorDAO.deleteById(jugadorID);
        }

        public void updateJugador (Jugador jugador){
            jugadorDAO.save(jugador);
        }


}
