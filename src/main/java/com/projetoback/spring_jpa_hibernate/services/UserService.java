package com.projetoback.spring_jpa_hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoback.spring_jpa_hibernate.entities.User;
import com.projetoback.spring_jpa_hibernate.repositories.UserRepository;

@Service //tranformando em componente do Spring para injeção.
public class UserService {
	
	@Autowired
	private UserRepository repositoty; // Realizando a injeção 
	
	public List<User> findAll(){
		return repositoty.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repositoty.findById(id);
		return obj.get();
	}

}
