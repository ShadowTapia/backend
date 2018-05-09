package com.piaget.sap.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.piaget.sap.model.Profes;
import com.piaget.sap.service.ProfesService;
import com.piaget.sap.util.RestResponse;

@RestController
public class ProfesController {

	@Autowired
	protected ProfesService profesService;

	protected ObjectMapper mapper;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String profesJson) throws JsonParseException, JsonMappingException, IOException {

		this.mapper = new ObjectMapper();

		Profes profes = this.mapper.readValue(profesJson, Profes.class);

		if (!this.validate(profes)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los campos obligatorios no fueron ingresados.-");
		}

		this.profesService.save(profes);

		return new RestResponse(HttpStatus.OK.value(), "Operación exitosa!");
	}

	private boolean validate(Profes profes) {
		boolean isValid = true;
		if (profes.getRun() == null) {
			isValid = false;
		}

		if (profes.getNomprofe() == null) {
			isValid = false;
		}

		if (profes.getPaterprofe() == null) {
			isValid = false;
		}

		if (profes.getMaterprofe() == null) {
			isValid = false;
		}

		if (profes.getEmailprofe() == null) {
			isValid = false;
		}

		return isValid;
	}
}
