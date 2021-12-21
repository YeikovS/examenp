package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
 
}
