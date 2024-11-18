package org.example.controller;

import org.example.dto.OrderDTO;
import org.example.dto.OrderItemDTO;
import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/orders")
    public ResponseEntity<Order> createOrder (@RequestBody OrderItemDTO orderItemDTO){
        try{
            Order order=orderService.createOrder(orderItemDTO);
            return new ResponseEntity<>(order,HttpStatus.CREATED);
        }catch (Exception e){

        }


}
}
