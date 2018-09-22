package com.eduardojr.cursomc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.cursomc2.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
