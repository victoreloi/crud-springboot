package com.victoreloi.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoreloi.example.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
}
