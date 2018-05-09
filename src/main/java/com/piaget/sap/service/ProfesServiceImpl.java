package com.piaget.sap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piaget.sap.dao.ProfesRepository;
import com.piaget.sap.model.Profes;

@Service
public class ProfesServiceImpl implements ProfesService {

	@Autowired
	protected ProfesRepository profesRepository;

	@Override
	public Profes save(Profes profes) {

		return this.profesRepository.save(profes);
	}

	@Override
	public List<Profes> findAll() {

		return this.profesRepository.findAll();
	}
}
