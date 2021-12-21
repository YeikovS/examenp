package com.examen.examen.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Empleado;
import com.examen.examen.repository.EmpleadoRepository;
import com.examen.examen.service.SEmpleado;


@Service
public class EmpleadoImpl implements SEmpleado {
@Autowired
private EmpleadoRepository empleadoRepository;
@Override
public Empleado create(Empleado empleado) {
	// TODO Auto-generated method stub
	return empleadoRepository.save(empleado);
}

@Override
public List<Empleado> readAll() {
	// TODO Auto-generated method stub
	return empleadoRepository.findAll();
}

@Override
public Empleado read(Long id) {
	// TODO Auto-generated method stub
	return empleadoRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	empleadoRepository.deleteById(id);
	
}

@Override
public Empleado update(Empleado empleado) {
	// TODO Auto-generated method stub
	return empleadoRepository.save(empleado);
}
}