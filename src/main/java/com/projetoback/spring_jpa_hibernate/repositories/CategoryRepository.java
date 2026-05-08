package com.projetoback.spring_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoback.spring_jpa_hibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
