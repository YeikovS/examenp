package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Autores;

public interface SAutores {
	Autores create(Autores autor);
    List<Autores> readAll();
    Autores read(Long id);
    void delete(Long id);
    Autores update(Autores autor);
}