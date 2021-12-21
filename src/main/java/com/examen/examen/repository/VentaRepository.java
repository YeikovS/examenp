package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
 
}
