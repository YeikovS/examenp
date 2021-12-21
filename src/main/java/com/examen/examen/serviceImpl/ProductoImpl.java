package com.examen.examen.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Producto;
import com.examen.examen.repository.ProductoRepository;
import com.examen.examen.service.SProducto;


@Service
public class ProductoImpl implements SProducto {
@Autowired
private ProductoRepository productoRepository;
@Override
public Producto create(Producto producto) {
	// TODO Auto-generated method stub
	return productoRepository.save(producto);
}

@Override
public List<Producto> readAll() {
	// TODO Auto-generated method stub
	return productoRepository.findAll();
}

@Override
public Producto read(Long id) {
	// TODO Auto-generated method stub
	return productoRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	productoRepository.deleteById(id);
	
}

@Override
public Producto update(Producto producto) {
	// TODO Auto-generated method stub
	return productoRepository.save(producto);
}
}