package com.project.web_tamplate_marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByBuyerId(Long buyerId);
}
