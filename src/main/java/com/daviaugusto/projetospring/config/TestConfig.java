package com.daviaugusto.projetospring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.daviaugusto.projetospring.entidades.Category;
import com.daviaugusto.projetospring.entidades.Order;
import com.daviaugusto.projetospring.entidades.User;
import com.daviaugusto.projetospring.entidades.enums.OrderStatus;
import com.daviaugusto.projetospring.repositories.CategoryRepository;
import com.daviaugusto.projetospring.repositories.OrderRepository;
import com.daviaugusto.projetospring.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers"); 
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Davi Augusto", "davi@gmail.com", "9999-9999", "alves0919");
		User u2 = new User(null, "Daniel Miranda", "daniel@gmail.com", "8888-9999", "alves1807");
		
		
		Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07Z"), OrderStatus.SHIPPED, u1);
		Order o2 = new Order(null, Instant.parse("2024-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o3 = new Order(null, Instant.parse("2024-07-22T15:21:22Z"), OrderStatus.CANCELED, u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		
		
	}
	
}
