package com.devsuperior.desafiocomponentesinjecao.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafiocomponentesinjecao.entity.Ordem;

@Service
public class ServicoFrete {

	public double frete(Ordem ordem) {
		if(ordem.getBasico() < 100.0) {
			return 20.0;
		}
		else if(ordem.getBasico() < 200.0) {
			return 12.0;
		}
		else {
			return 0.0;
		}
	}
}


