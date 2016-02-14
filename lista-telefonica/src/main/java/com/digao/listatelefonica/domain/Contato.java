package com.digao.listatelefonica.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Contato extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private String telefone;
	
	private String data;
	
	@Valid
	@ManyToOne
	private Operadora operadora;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	
}
