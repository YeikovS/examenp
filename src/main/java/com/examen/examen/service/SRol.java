package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Rol;

public interface SRol {
	Rol create(Rol rol);
    List<Rol> readAll();
    Rol read(Long id);
    void delete(Long id);
    Rol update(Rol rol);
}
