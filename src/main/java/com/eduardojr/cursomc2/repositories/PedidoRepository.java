package com.eduardojr.cursomc2.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.cursomc2.domain.Cliente;
import com.eduardojr.cursomc2.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);
}
