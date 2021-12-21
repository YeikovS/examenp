package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Usuario;

public interface SUsuario {
	Usuario create(Usuario usuario);
    List<Usuario> readAll();
    Usuario read(Long id);
    void delete(Long id);
    Usuario update(Usuario usuario);
}
