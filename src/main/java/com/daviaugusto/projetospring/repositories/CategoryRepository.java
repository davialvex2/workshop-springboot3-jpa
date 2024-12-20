package com.daviaugusto.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daviaugusto.projetospring.entidades.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
