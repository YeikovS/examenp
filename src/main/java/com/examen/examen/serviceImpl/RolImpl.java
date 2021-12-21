package com.examen.examen.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Rol;
import com.examen.examen.repository.RolRepository;
import com.examen.examen.service.SRol;


@Service
public class RolImpl implements SRol {
@Autowired
private RolRepository rolRepository;
@Override
public Rol create(Rol rol) {
	// TODO Auto-generated method stub
	return rolRepository.save(rol);
}

@Override
public List<Rol> readAll() {
	// TODO Auto-generated method stub
	return rolRepository.findAll();
}

@Override
public Rol read(Long id) {
	// TODO Auto-generated method stub
	return rolRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	rolRepository.deleteById(id);
	
}

@Override
public Rol update(Rol rol) {
	// TODO Auto-generated method stub
	return rolRepository.save(rol);
}
}