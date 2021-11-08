package com.examen.examen.entity;

import java.io.Serializable;
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
@Table(name = "autores")
public class Autores implements Serializable{

	private static final long serialVersionUID = 7418479443987851042L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idautor;
	
	private String nombres;
	private String apellidos;
	
	//Relaciones
	
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "autor")
	@JsonIgnore
	private List<Libros> libro = new ArrayList<>();
}


