package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

  private OrderService orderService;

  @PostMapping("/create")
  public void create(@RequestBody Order order) {
     orderService.create(order);
  }

  @GetMapping("/getByEmail/{email}")
  public ResponseEntity<Order> create(@PathVariable String email) {
    return orderService.getByEmail(email);
  }

}
