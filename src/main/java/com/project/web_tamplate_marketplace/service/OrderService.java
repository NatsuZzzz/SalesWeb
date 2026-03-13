package com.project.web_tamplate_marketplace.service;

import com.project.web_tamplate_marketplace.entity.Order;
import com.project.web_tamplate_marketplace.repository.OrderRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
      
    private final OrderRepository orderRepository;

    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order){
        order.setStatus("pending");
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id){
        return orderRepository.findById(id).orElse(null);   
    }

    public List<Order> getOrdersByBuyer(Long buyerId){
        return orderRepository.findByBuyerId(buyerId);
    }


    public Order updateOrderStatus(Long id, String status){
        Order order = orderRepository.findById(id).orElse(null);

        if(order != null){
            order.setStatus(status);
            return orderRepository.save(order);
        }
        return null;
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
