package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Cientifico;

public interface ICientificoService {
	
	public List<Cientifico> listarCientificos();
	
	public Cientifico guardarCientifico(Cientifico cientifico);
	
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void eliminarCientifico(int dni);

	public Cientifico cientificoXID(int dni);
	
}
