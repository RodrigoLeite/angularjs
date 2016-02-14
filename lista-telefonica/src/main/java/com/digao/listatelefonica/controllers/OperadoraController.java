package com.digao.listatelefonica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digao.listatelefonica.domain.Operadora;
import com.digao.listatelefonica.repository.OperadoraRepository;

@RestController
@RequestMapping("/operadoras")
public class OperadoraController {
	
	@Autowired
	private OperadoraRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Operadora> findAll() {
		return repository.findAll();
	}

}
