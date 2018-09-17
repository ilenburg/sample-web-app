package com.sistema.financeiro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DadosDomicilioBancario {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long codigoBanco;
	private long numeroAgencia;
	private String numeroContaCorrente;

	public DadosDomicilioBancario() {
	}

	public DadosDomicilioBancario(long codigoBanco, long numeroAgencia, String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public long getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(long codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public DadosDomicilioBancario withCodigoBanco(long codigoBanco) {
		this.codigoBanco = codigoBanco;
		return this;
	}

	public long getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(long numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public DadosDomicilioBancario withNumeroAgencia(long numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
		return this;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public DadosDomicilioBancario withNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
		return this;
	}

}
