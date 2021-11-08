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
@Table(name = "libros")
public class Libros implements Serializable{

	private static final long serialVersionUID = -1290834975075922123L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlibro;
	
	private String titulo;
	private int paginas;
	private String descripcion;
	
	//Relaciones
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "autor_id", referencedColumnName = "idautor")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Autores autor;
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "editorial_id", referencedColumnName = "ideditorial")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Editoriales editorial;
	
	
}