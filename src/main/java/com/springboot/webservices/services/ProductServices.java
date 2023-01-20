package com.springboot.webservices.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot.webservices.entities.Product;
import com.springboot.webservices.entities.DTO.ProductDto;
import com.springboot.webservices.repositories.CategoryRepository;
import com.springboot.webservices.repositories.ProductRepository;

@Service
public class ProductServices {

  @Autowired
  private ProductRepository repository;

  @Autowired
  private CategoryRepository catRepo;

  public List<Product> findAll() {
    return repository.findAll();
  }


  public Product findById(Long id) {
    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }


  public Product insert(Product obj) {
    Product prod = repository.save(obj);
    return prod;

  }
  
  

  
}
