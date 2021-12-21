package com.examen.examen.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Usuario_rol;
import com.examen.examen.repository.Usuario_rolRepository;
import com.examen.examen.service.SUsuario_rol;


@Service
public class Usuario_rolImpl implements SUsuario_rol {
@Autowired
private Usuario_rolRepository usuario_rolRepository;
@Override
public Usuario_rol create(Usuario_rol usuario_r) {
	// TODO Auto-generated method stub
	return usuario_rolRepository.save(usuario_r);
}

@Override
public List<Usuario_rol> readAll() {
	// TODO Auto-generated method stub
	return usuario_rolRepository.findAll();
}

@Override
public Usuario_rol read(Long id) {
	// TODO Auto-generated method stub
	return usuario_rolRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	usuario_rolRepository.deleteById(id);
	
}

@Override
public Usuario_rol update(Usuario_rol usuario_r) {
	// TODO Auto-generated method stub
	return usuario_rolRepository.save(usuario_r);
}
}