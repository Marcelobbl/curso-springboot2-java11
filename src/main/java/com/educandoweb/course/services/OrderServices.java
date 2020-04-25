package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> buscaTodos(){
		return repository.findAll();
		
	}
	
	public Order buscaPorId(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
