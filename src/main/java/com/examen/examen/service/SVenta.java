package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Venta;

public interface SVenta {
	Venta create(Venta venta);
    List<Venta> readAll();
    Venta read(Long id);
    void delete(Long id);
    Venta update(Venta venta);
}
