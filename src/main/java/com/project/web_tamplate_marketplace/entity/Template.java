package com.project.web_tamplate_marketplace.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Locale.Category;

import jakarta.persistence.*;


@Entity
@Table(name = "templates")
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Column(name = "price_source")
    private BigDecimal priceSource;

    @Column(name = "price_maintenance")
    private BigDecimal priceMaintenance;

    private String thumbnail;

    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
