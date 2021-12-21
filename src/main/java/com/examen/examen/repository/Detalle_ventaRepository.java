package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Detalle_venta;

@Repository
public interface Detalle_ventaRepository extends JpaRepository<Detalle_venta, Long> {
 
}
