package com.project.web_tamplate_marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.web_tamplate_marketplace.entity.TemplateImage;
import com.project.web_tamplate_marketplace.repository.TemplateImageRepository;

@Service
public class TemplateImageService {

    @Autowired
    private TemplateImageRepository templateImageRepository;

    public TemplateImage addImage(TemplateImage image) {
        return templateImageRepository.save(image);
    }

    public List<TemplateImage> getImagesByTemplate(Long templateId) {
        return templateImageRepository.findByTemplateId(templateId);
    }

    public TemplateImage getImageById(Long id) {
        return templateImageRepository.findById(id).orElse(null);
    }

    public void deleteImage(Long id) {
        templateImageRepository.deleteById(id);
    }
}
