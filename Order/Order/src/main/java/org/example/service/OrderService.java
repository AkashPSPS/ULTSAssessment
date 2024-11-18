package org.example.service;

import org.example.dto.OrderItemDTO;
import org.example.model.Order;
import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order createOrder(OrderItemDTO orderItem){
        Order order= orderRepository.saveAll();
        return order;
    }
}
