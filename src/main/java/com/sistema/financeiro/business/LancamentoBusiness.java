package com.sistema.financeiro.business;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema.financeiro.modelo.ControleLancamento;
import com.sistema.financeiro.modelo.LancamentoContaLegado;
import com.sistema.financeiro.modelo.TotalControleLancamento;
import com.sistema.financeiro.repositorio.ControleLancamentoRepository;

@Component
public class LancamentoBusiness {

	private static final Logger LOGGER = LogManager.getLogger();

	private static final int INDICE = 1;
	private static final int TAMANHO_PAGINA = 25;

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	public LancamentoContaLegado geraExtratoLancamentos(String codigoIdentificadorUnico) {
		List<ControleLancamento> listaControleLancamento;
		if (codigoIdentificadorUnico != null) {
			listaControleLancamento = (List<ControleLancamento>) controleLancamentoRepository
					.findByCodigoIdentificadorUnico(codigoIdentificadorUnico);
		} else {
			listaControleLancamento = (List<ControleLancamento>) controleLancamentoRepository.findAll();
		}
		long quantidadeLancamentos = listaControleLancamento.size();
		long quantidadeRemessas = listaControleLancamento.stream()
				.mapToLong(ControleLancamento::getQuantidadeLancamentoRemessa).sum();
		long valorLancamentos = listaControleLancamento.stream()
				.mapToLong(ControleLancamento::getValorLancamentoRemessa).sum();
		TotalControleLancamento totalControleLancamento = new TotalControleLancamento(quantidadeLancamentos,
				quantidadeRemessas, valorLancamentos);
		LancamentoContaLegado lancamentoContaLegado = new LancamentoContaLegado(totalControleLancamento,
				listaControleLancamento, INDICE, TAMANHO_PAGINA, quantidadeLancamentos);
		return lancamentoContaLegado;
	}

	public LancamentoContaLegado geraExtratoLancamentos() {
		return geraExtratoLancamentos(null);
	}

	public void initializeData() {
		ClassPathResource resource = new ClassPathResource("lancamento-conta-legado.json");
		try {
			File jsonFile = resource.getFile();
			ObjectMapper objectMapper = new ObjectMapper();
			LancamentoContaLegado lancamentoContaLegado = objectMapper.readValue(jsonFile, LancamentoContaLegado.class);
			lancamentoContaLegado.getListaControleLancamento().forEach(controleLancamentoRepository::save);
		} catch (IOException | NullPointerException e) {
			LOGGER.error("Erro ao inicializar os dados.", e);
		}
	}

}
