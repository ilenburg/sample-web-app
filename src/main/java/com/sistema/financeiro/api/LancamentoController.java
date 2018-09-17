package com.sistema.financeiro.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.financeiro.modelo.LancamentoContaLegado;

@RestController
public interface LancamentoController {

	@GetMapping("/lancamentos")
	public LancamentoContaLegado lancamentos();

	@GetMapping("/lancamentos/{codigoIdentificadorUnico}")
	public LancamentoContaLegado lancamentos(@PathVariable("codigoIdentificadorUnico") String codigoIdentificadorUnico);

}