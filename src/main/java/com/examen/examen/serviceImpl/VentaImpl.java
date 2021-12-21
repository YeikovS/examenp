package com.examen.examen.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Venta;
import com.examen.examen.repository.VentaRepository;
import com.examen.examen.service.SVenta;


@Service
public class VentaImpl implements SVenta {
@Autowired
private VentaRepository ventaRepository;
@Override
public Venta create(Venta venta) {
	// TODO Auto-generated method stub
	return ventaRepository.save(venta);
}

@Override
public List<Venta> readAll() {
	// TODO Auto-generated method stub
	return ventaRepository.findAll();
}

@Override
public Venta read(Long id) {
	// TODO Auto-generated method stub
	return ventaRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	ventaRepository.deleteById(id);
	
}

@Override
public Venta update(Venta venta) {
	// TODO Auto-generated method stub
	return ventaRepository.save(venta);
}
}