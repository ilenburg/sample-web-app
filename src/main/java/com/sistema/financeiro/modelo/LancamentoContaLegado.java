package com.sistema.financeiro.modelo;

import java.util.ArrayList;
import java.util.List;

public class LancamentoContaLegado {

	private TotalControleLancamento totalControleLancamento;
	private List<ControleLancamento> listaControleLancamento = new ArrayList<>();
	private long indice;
	private long tamanhoPagina;
	private long totalElements;

	public LancamentoContaLegado() {
	}

	public LancamentoContaLegado(TotalControleLancamento totalControleLancamento,
			List<ControleLancamento> listaControleLancamento, long indice, long tamanhoPagina, long totalElements) {
		super();
		this.totalControleLancamento = totalControleLancamento;
		this.listaControleLancamento = listaControleLancamento;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
	}

	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	public LancamentoContaLegado withTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
		return this;
	}

	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	public LancamentoContaLegado withControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
		return this;
	}

	public long getIndice() {
		return indice;
	}

	public void setIndice(long indice) {
		this.indice = indice;
	}

	public LancamentoContaLegado withIndice(long indice) {
		this.indice = indice;
		return this;
	}

	public long getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(long tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public LancamentoContaLegado withTamanhoPagina(long tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
		return this;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public LancamentoContaLegado withTotalElements(long totalElements) {
		this.totalElements = totalElements;
		return this;
	}

}
