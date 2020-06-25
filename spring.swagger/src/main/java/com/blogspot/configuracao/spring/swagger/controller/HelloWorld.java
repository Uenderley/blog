package com.blogspot.configuracao.spring.swagger.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping
    public String get(){
        return "GET executado com sucesso";
    }

    @PostMapping
    public String post(){
        return "POST executado com sucesso";
    }

    @DeleteMapping
    public String delete(){
        return "DELETE executado com sucesso";
    }

    @PutMapping
    public String put(){
        return "PUT executado com sucesso";
    }
}