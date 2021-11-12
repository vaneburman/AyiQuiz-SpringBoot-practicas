package com.example.ayiquiz.repositories;

import com.example.ayiquiz.model.Jugador;
import org.hibernate.annotations.RowId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JPAJugadorDAO extends JpaRepository<Jugador, Long> {
}
