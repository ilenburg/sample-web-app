package com.sistema.financeiro.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sistema.financeiro.modelo.ControleLancamento;

public interface ControleLancamentoRepository extends CrudRepository<ControleLancamento, Long> {

	List<ControleLancamento> findByCodigoIdentificadorUnico(String codigoIdentificadorUnico);
	
}
