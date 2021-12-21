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

import com.examen.examen.entity.Producto;
import com.examen.examen.service.SProducto;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	@Autowired
	private SProducto productoService;

	@GetMapping("/")
	public String get() {
		return "TODO OK";
	}
	
	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {
		try {
			Producto pro= productoService.create(producto);
			return new ResponseEntity<>(pro, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/listar")
	public ResponseEntity<List<Producto>> list() {
		try {
			List<Producto> list = new ArrayList<>();
			list = productoService.readAll();
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
	public ResponseEntity<Producto> search(@PathVariable("id") long id) {
		Producto producto = productoService.read(id);
		if (producto.getIdproducto() > 0) {
			return new ResponseEntity<>(producto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
		try {
			productoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Producto> update(@RequestBody Producto producto, @PathVariable("id") long id) {
		try {
			Producto pro = productoService.read(id);
			if (pro.getIdproducto() > 0) {
				pro.setNom_producto(producto.getNom_producto());
				pro.setPrecio(producto.getPrecio());
				pro.setStock(producto.getStock());
				pro.setIdcategoria(producto.getIdcategoria());

				return new ResponseEntity<>(productoService.create(pro), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
