package com.projetoback.spring_jpa_hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoback.spring_jpa_hibernate.entities.Order;
import com.projetoback.spring_jpa_hibernate.repositories.OrderRepository;

@Service //tranformando em componente do Spring para injeção.
public class OrderService {
	
	@Autowired
	private OrderRepository repository; // Realizando a injeção 
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
