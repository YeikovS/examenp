package com.examen.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Detalle_venta;
import com.examen.examen.repository.Detalle_ventaRepository;
import com.examen.examen.service.SDetalle_venta;


@Service
public class Detalle_ventaImpl implements SDetalle_venta {
@Autowired
private Detalle_ventaRepository detalle_ventaRepository;
@Override
public Detalle_venta create(Detalle_venta detalle_venta) {
	// TODO Auto-generated method stub
	return detalle_ventaRepository.save(detalle_venta);
}

@Override
public List<Detalle_venta> readAll() {
	// TODO Auto-generated method stub
	return detalle_ventaRepository.findAll();
}

@Override
public Detalle_venta read(Long id) {
	// TODO Auto-generated method stub
	return detalle_ventaRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	detalle_ventaRepository.deleteById(id);
	
}

@Override
public Detalle_venta update(Detalle_venta detalle_venta) {
	// TODO Auto-generated method stub
	return detalle_ventaRepository.save(detalle_venta);
}
}