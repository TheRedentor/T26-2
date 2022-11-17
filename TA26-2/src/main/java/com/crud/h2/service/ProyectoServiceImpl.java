package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IProyectoDAO;
import com.crud.h2.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO iProyectoDAO;
	
	@Override
	public List<Proyecto> listarProyectos() {
		
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(int id_proyecto) {
		
		return iProyectoDAO.findById(id_proyecto).get();
	}
	

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(int id_proyecto) {
		
		iProyectoDAO.deleteById(id_proyecto);
		
	}

}
