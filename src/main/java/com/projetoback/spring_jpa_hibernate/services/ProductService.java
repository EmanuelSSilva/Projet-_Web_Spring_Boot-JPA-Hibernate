package com.projetoback.spring_jpa_hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoback.spring_jpa_hibernate.entities.Product;
import com.projetoback.spring_jpa_hibernate.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List <Product> findAll(){ //Busca todos no repository
		return repository.findAll();
	}
	
	public Product findById(long id){
		Optional<Product> obj = repository.findById(id); //Busca categoria por id
		return obj.get();
	}
	
	
}
