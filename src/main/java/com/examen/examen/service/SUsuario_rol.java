package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Usuario_rol;

public interface SUsuario_rol {
	Usuario_rol create(Usuario_rol usuario_r);
    List<Usuario_rol> readAll();
    Usuario_rol read(Long id);
    void delete(Long id);
    Usuario_rol update(Usuario_rol usuario_r);
}
