package com.sistema.financeiro.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.sistema.financeiro.api.LancamentoController;
import com.sistema.financeiro.business.LancamentoBusiness;
import com.sistema.financeiro.modelo.LancamentoContaLegado;

@Component
public class LancamentoControllerImpl implements LancamentoController {
	
	@Autowired
	private LancamentoBusiness lancamentoBusiness;

	@Override
	public LancamentoContaLegado lancamentos() {
		return lancamentoBusiness.geraExtratoLancamentos();
	}

	@Override
	public LancamentoContaLegado lancamentos(@PathVariable("codigoIdentificadorUnico") String codigoIdentificadorUnico) {
		return lancamentoBusiness.geraExtratoLancamentos(codigoIdentificadorUnico);
	}

}