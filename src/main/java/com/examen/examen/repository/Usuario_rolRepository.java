package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Usuario_rol;

@Repository
public interface Usuario_rolRepository extends JpaRepository<Usuario_rol, Long> {
 
}
