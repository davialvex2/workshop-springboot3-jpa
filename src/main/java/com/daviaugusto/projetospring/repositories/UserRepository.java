package com.daviaugusto.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daviaugusto.projetospring.entidades.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
