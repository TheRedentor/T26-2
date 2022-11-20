package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="asignado_a")
public class AsignadoA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_asignado_a;
	
	@ManyToOne
    @JoinColumn(name="dni")
    private Cientifico cientifico;
	
	@ManyToOne
    @JoinColumn(name="id_proyecto")
    private Proyecto proyecto;
	
	public AsignadoA() {
		
	}

	/**
	 * @param codigo_asignado_a
	 * @param cientifico
	 * @param proyecto
	 */
	public AsignadoA(int codigo_asignado_a, Cientifico cientifico, Proyecto proyecto) {
		//super();
		this.codigo_asignado_a = codigo_asignado_a;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_asignado_a
	 */
	public int codigo_asignado_a() {
		return codigo_asignado_a;
	}

	/**
	 * @param codigo_asignado_a
	 */
	public void setId(int codigo_asignado_a) {
		this.codigo_asignado_a = codigo_asignado_a;
	}
	
	/**
	 * @return cientifico
	 */
	public Cientifico getCientifico() {
		return cientifico;
	}

	/**
	 * @param cientifico
	 */
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}
	
	/**
	 * @return proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Asignado a [codigo_asignado_a=" + codigo_asignado_a + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
	
}
