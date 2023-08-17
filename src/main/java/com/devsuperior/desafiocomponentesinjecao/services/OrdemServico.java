package com.devsuperior.desafiocomponentesinjecao.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafiocomponentesinjecao.entity.Ordem;

@Service
public class OrdemServico {

	private ServicoFrete servicoFrete;
	
	
	public OrdemServico(ServicoFrete servicoFrete) {
		this.servicoFrete = servicoFrete;
	}

	public double total(Ordem ordem) {
		return ordem.getBasico() - (ordem.getBasico() * (ordem.getDesconto() / 100.0))
				+ servicoFrete.frete(ordem);
	}
	
}
