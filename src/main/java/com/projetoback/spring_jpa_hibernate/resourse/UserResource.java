package com.projetoback.spring_jpa_hibernate.resourse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoback.spring_jpa_hibernate.entities.User;



@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User (1L, "Emanuel", "emanuel@gmail.com.br", "99999999", "123456789");
		return ResponseEntity.ok().body(u);
	}

}
