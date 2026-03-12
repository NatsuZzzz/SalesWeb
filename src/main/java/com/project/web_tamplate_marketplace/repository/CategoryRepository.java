package com.project.web_tamplate_marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
