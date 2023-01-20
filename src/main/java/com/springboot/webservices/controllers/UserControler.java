package com.springboot.webservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webservices.entities.User;
import com.springboot.webservices.services.UserServices;

@RestController                     //NOTAÇÃO REST PARA RECURSOS WEB
@RequestMapping(value = "/users")   //NOTAÇÃO DA ROTA
public class UserControler {

  @Autowired
  private UserServices userService;

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> list = userService.findAll();

    return ResponseEntity.ok().body(list);

  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
   User obj = userService.findById(id);

    return ResponseEntity.ok().body(obj);

  }
  


  
}
