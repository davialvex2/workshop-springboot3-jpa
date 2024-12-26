package com.daviaugusto.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daviaugusto.projetospring.entidades.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
