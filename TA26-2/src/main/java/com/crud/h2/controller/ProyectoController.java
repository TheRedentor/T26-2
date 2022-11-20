package com.crud.h2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Proyecto;
import com.crud.h2.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	
	@GetMapping("/proyectos/{id_proyecto}")
	public Proyecto proyectoXID(@PathVariable(name="id_proyecto") int id_proyecto) {
		
		Proyecto proyecto_xid= new Proyecto();
		
		proyecto_xid=proyectoServiceImpl.proyectoXID(id_proyecto);
		
		System.out.println("Proyecto XID: "+proyecto_xid);
		
		return proyecto_xid;
	}
	
	@PutMapping("/proyectos/{id_proyecto}")
	public Proyecto actualizarProyecto(@PathVariable(name="id_proyecto")int id_proyecto,@RequestBody Proyecto proyecto) {
		
		Proyecto proyecto_seleccionado= new Proyecto();
		Proyecto proyecto_actualizado= new Proyecto();
		
		proyecto_seleccionado= proyectoServiceImpl.proyectoXID(id_proyecto);
		
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		
		proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(proyecto_seleccionado);
		
		System.out.println("El proyecto actualizado es: "+ proyecto_actualizado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id_proyecto}")
	public void eliminarProyecto(@PathVariable(name="id_proyecto")int id_proyecto) {
		proyectoServiceImpl.eliminarProyecto(id_proyecto);
	}
}
