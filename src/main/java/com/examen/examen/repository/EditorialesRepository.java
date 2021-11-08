package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.entity.Editoriales;

@Repository
public interface EditorialesRepository extends JpaRepository<Editoriales, Long> {
 
}
