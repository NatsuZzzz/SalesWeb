package com.project.web_tamplate_marketplace.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.project.web_tamplate_marketplace.entity.Template;
import com.project.web_tamplate_marketplace.service.TemplateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/templates")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping
    public List<Template> getAllTemplates(){
        return templateService.getAllTemplates();
    }

    @GetMapping("/{id}")
    public Template getTemplateById(@PathVariable Long id){
        return templateService.getTemplateById(id);
    }

    @PostMapping
    public Template createTemplate(@RequestBody Template template){
        return templateService.createTemplate(template);
    }

    @PutMapping("/{id}")
    public Template updateTemplate(@PathVariable Long id, @RequestBody Template template){
        return templateService.updateTemplate(id, template);
    }

    @DeleteMapping("/{id}")
    public void deleteTemplate(@PathVariable Long id){
        templateService.deleteTemplate(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Template> getTemplatesByCategory(@PathVariable Long categoryId){
        return templateService.getTemplatesByCategory(categoryId);
    }

    @GetMapping("/seller/{sellerId}")
    public List<Template> getTemplatesBySeller(@PathVariable Long sellerId){
        return templateService.getTemplatesBySeller(sellerId);
    }

    @PutMapping("/{id}/approve")
    public Template approveTemplate(@PathVariable Long id){
        return templateService.approveTemplate(id);
    }

}