package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Empleado;

public interface SEmpleado {
	Empleado create(Empleado empleado);
    List<Empleado> readAll();
    Empleado read(Long id);
    void delete(Long id);
    Empleado update(Empleado empleado);
}
