package com.project.web_tamplate_marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.Template;

public interface TemplateRepository extends JpaRepository<Template, Long> {

    List<Template> findByCategoryId(Long categoryId);
    List<Template> findBySellerId(Long sellerId);
}
