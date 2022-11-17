package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyectos();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto proyectoXID(int id_proyecto);
	
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	public void eliminarProyecto(int id_proyecto);
	
}
