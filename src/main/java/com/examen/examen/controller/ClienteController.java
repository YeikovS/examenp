package com.examen.examen.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen.entity.Cliente;
import com.examen.examen.service.SCliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private SCliente clienteService;

	@GetMapping("/")
	public String get() {
		return "TODO OK";
	}
	
	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
		try {
			Cliente c = clienteService.create(cliente);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> list() {
		try {
			List<Cliente> list = new ArrayList<>();
			list = clienteService.readAll();
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// BUSCAR {ID}
	@GetMapping("/read/{id}")
	public ResponseEntity<Cliente> search(@PathVariable("id") long id) {
		Cliente cliente = clienteService.read(id);
		if (cliente.getIdcliente() > 0) {
			return new ResponseEntity<>(cliente, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
		try {
			clienteService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente, @PathVariable("id") long id) {
		try {
			Cliente c = clienteService.read(id);
			if (c.getIdcliente() > 0) {
				c.setNombres(cliente.getNombres());
				c.setApellidos(cliente.getApellidos());
				c.setDireccion(cliente.getDireccion());
				c.setTelefono(cliente.getTelefono());

				return new ResponseEntity<>(clienteService.create(c), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
