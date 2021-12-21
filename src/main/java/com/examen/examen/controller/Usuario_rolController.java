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

import com.examen.examen.entity.Usuario_rol;
import com.examen.examen.service.SUsuario_rol;

@RestController
@RequestMapping("/api/usuario_rol")
public class Usuario_rolController {

	@Autowired
	private SUsuario_rol usuario_rolService;

	@GetMapping("/")
	public String get() {
		return "TODO OK";
	}
	
	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Usuario_rol> save(@RequestBody Usuario_rol usuario_r) {
		try {
			Usuario_rol u_r = usuario_rolService.create(usuario_r);
			return new ResponseEntity<>(u_r, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/listar")
	public ResponseEntity<List<Usuario_rol>> list() {
		try {
			List<Usuario_rol> list = new ArrayList<>();
			list = usuario_rolService.readAll();
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
	public ResponseEntity<Usuario_rol> search(@PathVariable("id") long id) {
		Usuario_rol usuario_r =usuario_rolService.read(id);
		if (usuario_r.getIdusuario() > 0) {
			return new ResponseEntity<>(usuario_r, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
		try {
			usuario_rolService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Usuario_rol> update(@RequestBody Usuario_rol usuario_r, @PathVariable("id") long id) {
		try {
			Usuario_rol u_r = usuario_rolService.read(id);
			if (u_r.getIdusuario() > 0) {
				u_r.setIdrol(usuario_r.getIdrol());

				return new ResponseEntity<>(usuario_rolService.create(u_r), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
