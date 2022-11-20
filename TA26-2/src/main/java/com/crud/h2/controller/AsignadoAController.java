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

import com.crud.h2.dto.AsignadoA;
import com.crud.h2.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignado_a")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/asignado_a")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asignado_a) {
		
		return asignadoAServiceImpl.guardarAsignadoA(asignado_a);
	}
	
	
	@GetMapping("/asignado_a/{codigo_asignado_a}")
	public AsignadoA asignadoAXID(@PathVariable(name="codigo_asignado_a") int codigo_asignado_a) {
		
		AsignadoA asignado_a_xid= new AsignadoA();
		
		asignado_a_xid=asignadoAServiceImpl.asignadoAXID(codigo_asignado_a);
		
		System.out.println("AsignadoA XID: "+asignado_a_xid);
		
		return asignado_a_xid;
	}
	
	@PutMapping("/asignado_a/{codigo_asignado_a}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="codigo_asignado_a")int codigo_asignado_a,@RequestBody AsignadoA asignado_a) {
		
		AsignadoA asignado_a_seleccionado= new AsignadoA();
		AsignadoA asignado_a_actualizado= new AsignadoA();
		
		asignado_a_seleccionado= asignadoAServiceImpl.asignadoAXID(codigo_asignado_a);
		
		asignado_a_seleccionado.setCientifico(asignado_a.getCientifico());
		asignado_a_seleccionado.setProyecto(asignado_a.getProyecto());
		
		asignado_a_actualizado = asignadoAServiceImpl.actualizarAsignadoA(asignado_a_seleccionado);
		
		System.out.println("Asignado a actualizado es: "+ asignado_a_actualizado);
		
		return asignado_a_actualizado;
	}
	
	@DeleteMapping("/asignado_a/{codigo_asignado_a}")
	public void eliminarAsignadoA(@PathVariable(name="codigo_asignado_a")int codigo_asignado_a) {
		asignadoAServiceImpl.eliminarAsignadoA(codigo_asignado_a);
	}
}
