package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Producto;

public interface SProducto {
	Producto create(Producto producto);
    List<Producto> readAll();
    Producto read(Long id);
    void delete(Long id);
    Producto update(Producto producto);
}
