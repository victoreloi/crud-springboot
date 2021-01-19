package com.victoreloi.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoreloi.example.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
		
}
