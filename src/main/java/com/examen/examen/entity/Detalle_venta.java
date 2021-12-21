package com.examen.examen.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "detalle_venta")
public class Detalle_venta implements Serializable{

	private static final long serialVersionUID = -1290834975075922123L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddetalle_venta;
	
	private double precio_venta;
	private int cantidad_venta;
	private int idventa;
	private int idproducto;
	
	//Relaciones	
	
}