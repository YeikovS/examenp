package com.examen.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Cliente;
import com.examen.examen.repository.ClienteRepository;
import com.examen.examen.service.SCliente;


@Service
public class ClienteImpl implements SCliente {
@Autowired
private ClienteRepository clienteRepository;
@Override
public Cliente create(Cliente cliente) {
	// TODO Auto-generated method stub
	return clienteRepository.save(cliente);
}

@Override
public List<Cliente> readAll() {
	// TODO Auto-generated method stub
	return clienteRepository.findAll();
}

@Override
public Cliente read(Long id) {
	// TODO Auto-generated method stub
	return clienteRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	clienteRepository.deleteById(id);
	
}

@Override
public Cliente update(Cliente cliente) {
	// TODO Auto-generated method stub
	return clienteRepository.save(cliente);
}
}
