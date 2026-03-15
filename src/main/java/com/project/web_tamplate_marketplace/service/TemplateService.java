package com.project.web_tamplate_marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.web_tamplate_marketplace.entity.Template;
import com.project.web_tamplate_marketplace.repository.TemplateRepository;

@Service
public class TemplateService {

    private final TemplateRepository templateRepository;
    @Autowired
    private TemplateService templateService;

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
            template.setThumnail(templateDetails.getThumnail());  
        }
    }

}
