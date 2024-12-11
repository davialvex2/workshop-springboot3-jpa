package com.daviaugusto.projetospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daviaugusto.projetospring.entidades.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> buscarTodos(){
		User u = new User(1L, "Davi", "davi@gmail.com", "9999-9999", "alves0919");
		return ResponseEntity.ok().body(u);
	}

}
