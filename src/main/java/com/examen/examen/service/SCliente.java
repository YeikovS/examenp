package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Cliente;

public interface SCliente {
	Cliente create(Cliente cliente);
    List<Cliente> readAll();
    Cliente read(Long id);
    void delete(Long id);
    Cliente update(Cliente cliente);
}

