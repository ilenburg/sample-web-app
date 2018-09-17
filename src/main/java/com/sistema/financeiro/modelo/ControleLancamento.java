package com.sistema.financeiro.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ControleLancamento {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    @OneToOne(cascade=CascadeType.ALL)
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private long numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private long quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private long valorLancamentoRemessa;
	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;

	public ControleLancamento() {
	}

	public ControleLancamento(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente,
			String dataEfetivaLancamento, String dataLancamentoContaCorrenteCliente, long numeroEvento,
			String descricaoGrupoPagamento, String codigoIdentificadorUnico, String nomeBanco,
			long quantidadeLancamentoRemessa, String numeroRaizCNPJ, String numeroSufixoCNPJ, long valorLancamentoRemessa,
			long dateLancamentoContaCorrenteCliente, long dateEfetivaLancamento) {
		super();
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	public ControleLancamento withLancamentoContaCorrenteCliente(
			LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		return this;
	}

	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public ControleLancamento withDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		return this;
	}

	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public ControleLancamento withDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		return this;
	}

	public long getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public ControleLancamento withNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
		return this;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public ControleLancamento withDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		return this;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public ControleLancamento withCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		return this;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public ControleLancamento withNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
		return this;
	}

	public long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public ControleLancamento withQuantidadeLancamentoRemessa(long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		return this;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public ControleLancamento withNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		return this;
	}

	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public ControleLancamento withNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		return this;
	}

	public long getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(long valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public ControleLancamento withValorLancamentoRemessa(long valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		return this;
	}

	public long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public ControleLancamento withDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		return this;
	}

	public long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public ControleLancamento withDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
		return this;
	}

}
