package com.examen.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Libros;
import com.examen.examen.repository.LibrosRepository;
import com.examen.examen.service.SLibros;


@Service
public class LibrosImpl implements SLibros {
@Autowired
private LibrosRepository librosRepository;
@Override
public Libros create(Libros libro) {
	// TODO Auto-generated method stub
	return librosRepository.save(libro);
}

@Override
public List<Libros> readAll() {
	// TODO Auto-generated method stub
	return librosRepository.findAll();
}

@Override
public Libros read(Long id) {
	// TODO Auto-generated method stub
	return librosRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	librosRepository.deleteById(id);
	
}

@Override
public Libros update(Libros libro) {
	// TODO Auto-generated method stub
	return librosRepository.save(libro);
}
}