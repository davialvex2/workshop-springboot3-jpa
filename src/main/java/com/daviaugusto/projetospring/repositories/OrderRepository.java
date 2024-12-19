package com.daviaugusto.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daviaugusto.projetospring.entidades.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
