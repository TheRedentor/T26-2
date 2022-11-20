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

import com.crud.h2.dto.Cientifico;
import com.crud.h2.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	
	@GetMapping("/cientificos/{dni}")
	public Cientifico cientificoXID(@PathVariable(name="dni") int dni) {
		
		Cientifico cientifico_xid= new Cientifico();
		
		cientifico_xid=cientificoServiceImpl.cientificoXID(dni);
		
		System.out.println("Cientifico XID: "+cientifico_xid);
		
		return cientifico_xid;
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientifico actualizarCientifico(@PathVariable(name="dni")int dni,@RequestBody Cientifico cientifico) {
		
		Cientifico cientifico_seleccionado= new Cientifico();
		Cientifico cientifico_actualizado= new Cientifico();
		
		cientifico_seleccionado= cientificoServiceImpl.cientificoXID(dni);
		
		cientifico_seleccionado.setNomApels(cientifico.getNomApels());
		
		cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		System.out.println("El cientifico actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientifico(@PathVariable(name="dni")int dni) {
		cientificoServiceImpl.eliminarCientifico(dni);
	}
}
