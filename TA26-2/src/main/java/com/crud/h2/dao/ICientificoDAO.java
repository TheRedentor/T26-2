package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, Integer> {

}
