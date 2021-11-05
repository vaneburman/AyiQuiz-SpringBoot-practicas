package com.example.ayiquiz.repositories;

import com.example.ayiquiz.model.Opcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARespuestasDAO extends JpaRepository<Opcion, Long> {
}
