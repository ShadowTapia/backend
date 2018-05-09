package com.piaget.sap.service;

import java.util.List;

import com.piaget.sap.model.Profes;

public interface ProfesService {

	/**
	 * Guarda un profesor
	 * 
	 * @param profes
	 * @return el profesor ingresado
	 */
	Profes save(Profes profes);

	/**
	 * Recupera la lista de docentes
	 * 
	 * @return lista de docentes
	 */
	List<Profes> findAll();
}
