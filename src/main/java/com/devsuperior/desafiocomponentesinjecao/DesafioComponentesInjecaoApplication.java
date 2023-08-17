package com.devsuperior.desafiocomponentesinjecao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafiocomponentesinjecao.entity.Ordem;
import com.devsuperior.desafiocomponentesinjecao.services.OrdemServico;

@SpringBootApplication
public class DesafioComponentesInjecaoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesInjecaoApplication.class, args);
		
	}

	private OrdemServico ordemService;
	
	
	public DesafioComponentesInjecaoApplication	(OrdemServico ordemService) {
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Ordem ordem1 = new Ordem(1034, 150.0, 20.0);

		System.out.println("Order code " + ordem1.getCodigo());
		System.out.println("Order total value: R$ " + ordemService.total(ordem1));

		Ordem ordem2 = new Ordem(2282, 800.0, 10.0);

		System.out.println("Order code " + ordem2.getCodigo());
		System.out.println("Order total value: R$ " + ordemService.total(ordem2));

		Ordem ordem3 = new Ordem(1309, 95.9, 0.0);

		System.out.println("Order code " + ordem3.getCodigo());
		System.out.println("Order total value: R$ " + ordemService.total(ordem3));	
		
	

	}
	
}
