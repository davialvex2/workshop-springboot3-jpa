package com.daviaugusto.projetospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.daviaugusto.projetospring.entidades.User;
import com.daviaugusto.projetospring.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Davi Augusto", "davi@gmail.com", "9999-9999", "alves0919");
		User u2 = new User(null, "Daniel Miranda", "daniel@gmail.com", "8888-9999", "alves1807");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
