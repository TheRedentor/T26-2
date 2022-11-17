package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Integer> {
	
}