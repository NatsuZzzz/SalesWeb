package com.project.web_tamplate_marketplace.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "template_images")
public class TemplateImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "template_id")
    private Template template;

}