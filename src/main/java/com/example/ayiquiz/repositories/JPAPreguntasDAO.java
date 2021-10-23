package com.example.ayiquiz.repositories;

import com.example.ayiquiz.model.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JPAPreguntasDAO extends JpaRepository<Preguntas, Long> {
}
