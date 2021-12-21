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
@RequestMapping("/api/detalle_venta")
public class Detalle_ventaController {

	@Autowired
	private SDetalle_venta detalle_ventaService;

	@GetMapping("/")
	public String get() {
		return "TODO OK";
	}
	
	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Detalle_venta> save(@RequestBody Detalle_venta detalle_venta) {
		try {
			Detalle_venta det_v = detalle_ventaService.create(detalle_venta);
			return new ResponseEntity<>(det_v, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/listar")
	public ResponseEntity<List<Detalle_venta>> list() {
		try {
			List<Detalle_venta> list = new ArrayList<>();
			list = detalle_ventaService.readAll();
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
	public ResponseEntity<Detalle_venta> search(@PathVariable("id") long id) {
		Detalle_venta detalle_venta = detalle_ventaService.read(id);
		if (detalle_venta.getIddetalle_venta() > 0) {
			return new ResponseEntity<>(detalle_venta, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
		try {
			detalle_ventaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Detalle_venta> update(@RequestBody Detalle_venta detalle_venta, @PathVariable("id") long id) {
		try {
			Detalle_venta det_v = detalle_ventaService.read(id);
			if (det_v.getIddetalle_venta() > 0) {
				det_v.setPrecio_venta(detalle_venta.getPrecio_venta());
				det_v.setCantidad_venta(detalle_venta.getCantidad_venta());
				det_v.setIdventa(detalle_venta.getIdventa());
				det_v.setIdproducto(detalle_venta.getIdproducto());

				return new ResponseEntity<>(detalle_ventaService.create(det_v), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
