package com.examen.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Categoria;
import com.examen.examen.repository.CategoriaRepository;
import com.examen.examen.service.SCategoria;


@Service
public class CategoriaImpl implements SCategoria {
@Autowired
private CategoriaRepository categoriaRepository;
@Override
public Categoria create(Categoria categoria) {
	// TODO Auto-generated method stub
	return categoriaRepository.save(categoria);
}

@Override
public List<Categoria> readAll() {
	// TODO Auto-generated method stub
	return categoriaRepository.findAll();
}

@Override
public Categoria read(Long id) {
	// TODO Auto-generated method stub
	return categoriaRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	categoriaRepository.deleteById(id);
	
}

@Override
public Categoria update(Categoria categoria) {
	// TODO Auto-generated method stub
	return categoriaRepository.save(categoria);
}
}
