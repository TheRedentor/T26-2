package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="proyectos")
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_proyecto;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
    @JoinColumn(name="id_proyecto")
    private List<AsignadoA> asignado_a;
	
	public Proyecto() {
		
	}

	/**
	 * @param id_proyecto
	 * @param nombre
	 * @param horas
	 */
	public Proyecto(int id_proyecto, String nombre, int horas) {
		//super();
		this.id_proyecto = id_proyecto;
		this.nombre = nombre;
		this.horas = horas;
	}

	
	//Getters y Setters
	
	/**
	 * @return id_proyecto
	 */
	public int getId() {
		return id_proyecto;
	}

	/**
	 * @param id_proyecto
	 */
	public void setId(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return horas
	 */
	public int getHoras() {
		return horas;
	}
	
	/**
	 * @param horas
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	/**
	 * @return asignado_a
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignado_a;
	}

	/**
	 * @param asignado_a
	 */
	public void setAsignadoA(List<AsignadoA> asignado_a) {
		this.asignado_a = asignado_a;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Proyecto [id_proyecto=" + id_proyecto + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
	
}
