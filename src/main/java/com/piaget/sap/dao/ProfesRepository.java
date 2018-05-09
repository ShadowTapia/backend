package com.piaget.sap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piaget.sap.model.Profes;

public interface ProfesRepository extends JpaRepository<Profes, Long> {
	
	@Override
	@SuppressWarnings("unchecked")
	Profes save(Profes profes);


}
