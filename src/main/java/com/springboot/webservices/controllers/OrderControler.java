package com.springboot.webservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webservices.entities.Order;
import com.springboot.webservices.services.OrderServices;

@RestController                     //NOTAÇÃO REST PARA RECURSOS WEB
@RequestMapping(value = "/orders")   //NOTAÇÃO DA ROTA
public class OrderControler {

  @Autowired
  private OrderServices OrderService;

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    List<Order> list = OrderService.findAll();

    return ResponseEntity.ok().body(list);

  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Long id) {
   Order obj = OrderService.findById(id);

    return ResponseEntity.ok().body(obj);

  }
  


  
}
