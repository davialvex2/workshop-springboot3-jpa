package com.daviaugusto.projetospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviaugusto.projetospring.entidades.User;
import com.daviaugusto.projetospring.repositories.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> buscarTodos(){
		return userRepository.findAll();
	}
	
	public User buscarPorId(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
	public User inserirUser(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, user);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setNome(user.getNome());
		entity.setEmail(user.getEmail());
		entity.setTelefone(user.getTelefone());
		
	}

}
