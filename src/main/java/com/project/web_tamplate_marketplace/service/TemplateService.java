package com.project.web_tamplate_marketplace.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.project.web_tamplate_marketplace.entity.Template;
import com.project.web_tamplate_marketplace.repository.TemplateRepository;

@Service
public class TemplateService {

    private final TemplateRepository templateRepository;


    TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public List<Template> getAllTemplates() {
        return templateRepository.findAll();
    }

    public Template getTemplateById(Long id) {
        return templateRepository.findById(id).orElse(null);
    }

    public Template createTemplate(Template template) {
        template.setStatus("pending");
        return templateRepository.save(template);
    }

    public Template updateTemplate(Long id, Template templateDetails) {
        Template template = templateRepository.findById(id).orElse(null);

        if (template != null) {
            template.setTitle(templateDetails.getTitle());
            template.setDescription(templateDetails.getDescription());
            template.setPriceSource(templateDetails.getPriceSource());
            template.setPriceMaintenance(templateDetails.getPriceMaintenance());
            template.setThumbnail(templateDetails.getThumbnail());

            return templateRepository.save(template);  
        }
        return null;
    }

    public void deleteTemplate(Long id) {
        templateRepository.deleteById(id);
    }

    public List<Template> getTemplatesByCategory(Long categoryId) {
        return templateRepository.findByCategoryId(categoryId);
    }

    public List<Template> getTemplatesBySeller(Long sellerId) {
        return templateRepository.findBySellerId(sellerId);
    }

    public Template approveTemplate(Long id){

        Template template = templateRepository.findById(id).orElse(null);

        if(template != null){
            template.setStatus("approved");
            return templateRepository.save(template);
        }

        return null;

}
}
