package com.sistema.financeiro.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sistema.financeiro.modelo.DadosDomicilioBancario;

public interface DadosDomicilioBancarioRepository extends CrudRepository<DadosDomicilioBancario, Long> {

	List<DadosDomicilioBancario> findByCodigoBanco(long codigoBanco);

}
