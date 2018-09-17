package com.sistema.financeiro.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LancamentoContaCorrenteCliente {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	@OneToOne(cascade=CascadeType.ALL)
	private DadosDomicilioBancario dadosDomicilioBancario;
	private String nomeTipoOperacao;

	public LancamentoContaCorrenteCliente() {
	}

	public LancamentoContaCorrenteCliente(long numeroRemessaBanco, String nomeSituacaoRemessa, String nomeTipoOperacao) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public LancamentoContaCorrenteCliente withNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
		return this;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public LancamentoContaCorrenteCliente withNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		return this;
	}

	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public LancamentoContaCorrenteCliente withDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
		return this;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public LancamentoContaCorrenteCliente withNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
		return this;
	}

}
