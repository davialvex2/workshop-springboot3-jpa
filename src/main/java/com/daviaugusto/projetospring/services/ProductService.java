package com.daviaugusto.projetospring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daviaugusto.projetospring.entidades.Product;
import com.daviaugusto.projetospring.repositories.ProductRepository;


@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> buscarTodos(){
		return productRepository.findAll();
	}
	
	public Product buscarPorId(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
		
	}

}
