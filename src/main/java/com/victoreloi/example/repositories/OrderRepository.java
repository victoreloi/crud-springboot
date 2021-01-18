package com.victoreloi.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoreloi.example.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
}
