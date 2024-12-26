package com.daviaugusto.projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daviaugusto.projetospring.entidades.Product;
import com.daviaugusto.projetospring.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> buscarTodos(){
		List<Product> obj = service.buscarTodos();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> buscarPorId(@PathVariable Long id){
		Product obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

}
