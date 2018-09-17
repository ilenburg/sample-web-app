package com.sistema.financeiro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sistema.financeiro.business.LancamentoBusiness;

@SpringBootApplication
public class SistemaFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFinanceiroApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setupData(LancamentoBusiness lancamentoBusiness) {
		return (input) -> {
			lancamentoBusiness.initializeData();
		};
	}
}
