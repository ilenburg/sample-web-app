package com.sistema.financeiro.modelo;

public class TotalControleLancamento {

	private long quantidadeLancamentos;
	private long quantidadeRemessas;
	private double valorLancamentos;

	public TotalControleLancamento() {
	}

	public TotalControleLancamento(long quantidadeLancamentos, long quantidadeRemessas, double valorLancamentos) {
		super();
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
	}

	public long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public TotalControleLancamento withQuantidadeLancamentos(long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
		return this;
	}

	public long getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public TotalControleLancamento withQuantidadeRemessas(long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
		return this;
	}

	public double getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

	public TotalControleLancamento withValorLancamentos(double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
		return this;
	}

}