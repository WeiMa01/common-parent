package com.yuxiu.edu.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    public ResponseEntity<String> login(){
        System.out.println("welcome");
        return ResponseEntity.ok().body("hello");
    }
}
