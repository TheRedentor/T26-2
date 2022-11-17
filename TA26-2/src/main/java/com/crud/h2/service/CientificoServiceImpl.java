package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.h2.dao.ICientificoDAO;
import com.crud.h2.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService {
	@Autowired
	ICientificoDAO iCientificoDAO;
	
	@Override
	public List<Cientifico> listarCientificos() {
		
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(int dni) {
		
		return iCientificoDAO.findById(dni).get();
	}
	

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(int dni) {
		
		iCientificoDAO.deleteById(dni);
		
	}
}
