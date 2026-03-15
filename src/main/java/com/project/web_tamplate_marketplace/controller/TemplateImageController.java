package com.project.web_tamplate_marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.project.web_tamplate_marketplace.entity.TemplateImage;
import com.project.web_tamplate_marketplace.service.TemplateImageService;

@RestController
@RequestMapping("/template-images")
public class TemplateImageController {

    @Autowired
    private TemplateImageService templateImageService;

    @PostMapping
    public TemplateImage addImage(@RequestBody TemplateImage image){
        return templateImageService.addImage(image);
    }

    @GetMapping("/template/{templateId}")
    public List<TemplateImage> getImagesByTemplate(@PathVariable Long templateId){
        return templateImageService.getImagesByTemplate(templateId);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable Long id){
        templateImageService.deleteImage(id);
    }

}