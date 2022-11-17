package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAsignadoADAO;
import com.crud.h2.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService {

	@Autowired
	IAsignadoADAO iAsignadoADAO;
	
	@Override
	public List<AsignadoA> listarAsignadoA() {
		
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignado_a) {

		return iAsignadoADAO.save(asignado_a);
	}

	@Override
	public AsignadoA asignadoAXID(int codigo_asignado_a) {

		return iAsignadoADAO.findById(codigo_asignado_a).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignado_a) {

		return iAsignadoADAO.save(asignado_a);
	}

	@Override
	public void eliminarAsignadoA(int codigo_asignado_a) {

		iAsignadoADAO.deleteById(codigo_asignado_a);
		
	}

}
