package com.eduardojr.cursomc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.cursomc2.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
