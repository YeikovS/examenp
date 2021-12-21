package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
 
}
