package com.project.web_tamplate_marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web_tamplate_marketplace.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
