package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Detalle_venta;

public interface SDetalle_venta {
	Detalle_venta create(Detalle_venta detalle_venta);
    List<Detalle_venta> readAll();
    Detalle_venta read(Long id);
    void delete(Long id);
    Detalle_venta update(Detalle_venta detalle_venta);
}
