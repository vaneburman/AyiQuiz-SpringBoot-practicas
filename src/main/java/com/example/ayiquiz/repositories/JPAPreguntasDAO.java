package com.example.ayiquiz.repositories;

import com.example.ayiquiz.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JPAPreguntasDAO extends JpaRepository<Pregunta, Long> {
}
