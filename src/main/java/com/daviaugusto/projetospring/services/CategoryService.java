package com.daviaugusto.projetospring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daviaugusto.projetospring.entidades.Category;
import com.daviaugusto.projetospring.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public List<Category> buscarTodos(){
		return categoryRepository.findAll();
	}
	
	public Category buscarPorId(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
		
	}

}
