package com.digao.listatelefonica.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digao.listatelefonica.domain.Contato;
import com.digao.listatelefonica.repository.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Contato salvar(@RequestBody @Valid Contato contato) {
		return repository.save(contato);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Contato> findAll() {
		return repository.findAll();
	}
}
