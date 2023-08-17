package com.devsuperior.desafiocomponentesinjecao.entity;

import org.springframework.stereotype.Service;

@Service
public class Ordem {

	private Integer codigo;
	private Double basico;
	private Double desconto;
	
	public Ordem() {
		
	}
	
	public Ordem(Integer codigo, Double basico, Double desconto) {
		this.codigo = codigo;
		this.basico = basico;
		this.desconto = desconto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getBasico() {
		return basico;
	}

	public void setBasico(Double basico) {
		this.basico = basico;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	
}