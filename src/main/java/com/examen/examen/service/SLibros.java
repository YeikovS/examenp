package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Libros;

public interface SLibros {
	Libros create(Libros libro);
    List<Libros> readAll();
    Libros read(Long id);
    void delete(Long id);
    Libros update(Libros libro);
}
