package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Long> {
 
}
