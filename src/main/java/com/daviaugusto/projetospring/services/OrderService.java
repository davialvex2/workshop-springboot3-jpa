package com.daviaugusto.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviaugusto.projetospring.entidades.Order;
import com.daviaugusto.projetospring.repositories.OrderRepository;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public List<Order> buscarTodos(){
		return orderRepository.findAll();
	}
	
	public Order buscarPorId(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
		
	}

}
