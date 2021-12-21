package com.examen.examen.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Usuario;
import com.examen.examen.repository.UsuarioRepository;
import com.examen.examen.service.SUsuario;


@Service
public class UsuarioImpl implements SUsuario {
@Autowired
private UsuarioRepository usuarioRepository;
@Override
public Usuario create(Usuario usuario) {
	// TODO Auto-generated method stub
	return usuarioRepository.save(usuario);
}

@Override
public List<Usuario> readAll() {
	// TODO Auto-generated method stub
	return usuarioRepository.findAll();
}

@Override
public Usuario read(Long id) {
	// TODO Auto-generated method stub
	return usuarioRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	usuarioRepository.deleteById(id);
	
}

@Override
public Usuario update(Usuario usuario) {
	// TODO Auto-generated method stub
	return usuarioRepository.save(usuario);
}
}