package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Autores;

@Repository
public interface AutoresRepository extends JpaRepository<Autores, Long> {
 
}
