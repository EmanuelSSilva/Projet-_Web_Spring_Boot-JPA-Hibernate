package com.projetoback.spring_jpa_hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoback.spring_jpa_hibernate.entities.Category;
import com.projetoback.spring_jpa_hibernate.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List <Category> findAll(){ //Busca todos no repository
		return repository.findAll();
	}
	
	public Category findById(long id){
		Optional<Category> obj = repository.findById(id); //Busca categoria por id
		return obj.get();
	}
	
	
}
