package com.wanderoliveira.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderoliveira.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
