package com.daviaugusto.projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daviaugusto.projetospring.entidades.Category;
import com.daviaugusto.projetospring.services.CategoryService;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> buscarTodos(){
		List<Category> obj = service.buscarTodos();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> buscarPorId(@PathVariable Long id){
		Category obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

}
