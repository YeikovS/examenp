package com.examen.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Autores;
import com.examen.examen.repository.AutoresRepository;
import com.examen.examen.service.SAutores;


@Service
public class AutoresImpl implements SAutores {
@Autowired
private AutoresRepository autoresRepository;
@Override
public Autores create(Autores autor) {
	// TODO Auto-generated method stub
	return autoresRepository.save(autor);
}

@Override
public List<Autores> readAll() {
	// TODO Auto-generated method stub
	return autoresRepository.findAll();
}

@Override
public Autores read(Long id) {
	// TODO Auto-generated method stub
	return autoresRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	autoresRepository.deleteById(id);
	
}

@Override
public Autores update(Autores autor) {
	// TODO Auto-generated method stub
	return autoresRepository.save(autor);
}
}
