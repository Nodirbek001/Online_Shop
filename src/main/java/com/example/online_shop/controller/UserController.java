package com.example.online_shop.controller;

import com.example.online_shop.dto.userDTO.LoginDTO;
import com.example.online_shop.dto.userDTO.RegisterDTO;
import com.example.online_shop.enytity.user.User;
import com.example.online_shop.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/creat")
    public HttpEntity<?> addUser(@RequestBody RegisterDTO registerDTO) {
        Serializable serializable = userService.add(registerDTO);
        return ResponseEntity.ok(serializable);
    }

    @PostMapping("/login")
    public HttpEntity<?> login(@RequestBody LoginDTO loginDTO) {
        boolean login = userService.login(loginDTO);
        System.out.println(login);
        return ResponseEntity.ok(login);
    }
}
