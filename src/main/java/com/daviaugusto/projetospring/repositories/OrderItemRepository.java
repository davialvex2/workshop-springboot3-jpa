package com.daviaugusto.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daviaugusto.projetospring.entidades.OrderItem;
import com.daviaugusto.projetospring.entidades.pk.OrderItemPK;




public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
