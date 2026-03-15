package com.project.web_tamplate_marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.TemplateImage;

public interface TemplateImageRepository extends JpaRepository<TemplateImage, Long> {
    List<TemplateImage> findByTemplateId(Long templateId);
}