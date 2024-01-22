package com.example.k8.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping
    public ResponseEntity<?> helloWorld(){
        return ResponseEntity.ok("hello world");
    }
}
