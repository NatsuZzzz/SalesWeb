package com.project.web_tamplate_marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.ContactRequest;

public interface ContactRequestRepository extends JpaRepository<ContactRequest, Long> {
    
    List<ContactRequest> findBySellerId(Long sellerId);
    List<ContactRequest> findByBuyerId(Long buyerId);
}
