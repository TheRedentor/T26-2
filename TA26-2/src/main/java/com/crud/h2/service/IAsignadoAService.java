package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.AsignadoA;

public interface IAsignadoAService {
	
	public List<AsignadoA> listarAsignadoA();
	
	public AsignadoA guardarAsignadoA(AsignadoA asignado_a);
	
	public AsignadoA asignadoAXID(int codigo_asignado_a);
	
	public AsignadoA actualizarAsignadoA(AsignadoA asignado_a);
	
	public void eliminarAsignadoA(int codigo_asignado_a);
	
}
