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

import com.examen.examen.entity.*;
import com.examen.examen.service.*;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

	@Autowired
	private SCategoria categoriaService;

	@GetMapping("/")
	public String get() {
		return "TODO OK";
	}
	
	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
		try {
			Categoria a = categoriaService.create(categoria);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/listar")
	public ResponseEntity<List<Categoria>> list() {
		try {
			List<Categoria> list = new ArrayList<>();
			list = categoriaService.readAll();
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
	public ResponseEntity<Categoria> search(@PathVariable("id") long id) {
		Categoria categoria = categoriaService.read(id);
		if (categoria.getIdcategoria() > 0) {
			return new ResponseEntity<>(categoria, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
		try {
			categoriaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Categoria> update(@RequestBody Categoria categoria, @PathVariable("id") long id) {
		try {
			Categoria a = categoriaService.read(id);
			if (a.getIdcategoria() > 0) {
				a.setNom_cat(categoria.getNom_cat());

				return new ResponseEntity<>(categoriaService.create(a), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
