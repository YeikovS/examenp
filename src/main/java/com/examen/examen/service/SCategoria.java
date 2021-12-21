package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Categoria;

public interface SCategoria {
	Categoria create(Categoria categoria);
    List<Categoria> readAll();
    Categoria read(Long id);
    void delete(Long id);
    Categoria update(Categoria categoria);
}