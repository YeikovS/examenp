package com.examen.examen.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "venta")
public class Venta implements Serializable{

	private static final long serialVersionUID = 8739503533530437481L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idventa;
	
	private int idcliente;
	private int idusuario;
	private Date fecha;
	
	//Relaciones
	
}
