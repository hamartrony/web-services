package com.springboot.webservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webservices.entities.Product;
import com.springboot.webservices.entities.DTO.ProductDto;
import com.springboot.webservices.services.ProductServices;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@RestController                     //NOTAÇÃO REST PARA RECURSOS WEB
@RequestMapping(value = "/products")   //NOTAÇÃO DA ROTA
public class ProductControler {

  @Autowired
  private ProductServices ProductService;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    List<Product> list = ProductService.findAll();

    return ResponseEntity.ok().body(list);

  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id) {
    Product obj = ProductService.findById(id);

    return ResponseEntity.ok().body(obj);

  }
  
  @PostMapping
  public ResponseEntity<Product> insert(@RequestBody Product body) {
    System.out.println(body);
   
    Product obj = ProductService.insert(body);

    return ResponseEntity.ok().body(obj);

  }
  


  
}
