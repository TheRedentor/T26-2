package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cientificos")
public class Cientifico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dni;
	@Column(name = "nomapels")
	private String nomapels;
	
	@OneToMany
    @JoinColumn(name="dni")
    private List<AsignadoA> asignado_a;
	
	public Cientifico() {
		
	}

	/**
	 * @param dni
	 * @param nomapels
	 */
	public Cientifico(int dni, String nomapels) {
		//super();
		this.dni = dni;
		this.nomapels = nomapels;
	}

	
	//Getters y Setters
	
	/**
	 * @return dni
	 */
	public int getId() {
		return dni;
	}

	/**
	 * @param dni
	 */
	public void setId(int dni) {
		this.dni = dni;
	}

	/**
	 * @return nomapels
	 */
	public String getNomApels() {
		return nomapels;
	}

	/**
	 * @param nomapels
	 */
	public void setNomApels(String nomapels) {
		this.nomapels = nomapels;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomapels=" + nomapels + "]";
	}
}
