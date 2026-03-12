package com.project.web_tamplate_marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.ContactRequest;

public interface ContactRequestRepository extends JpaRepository<ContactRequest, Long> {
    
}
