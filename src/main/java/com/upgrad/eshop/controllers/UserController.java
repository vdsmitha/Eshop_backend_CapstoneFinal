package com.upgrad.eshop.controllers;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class UserController {

    @GetMapping("/users/access-token/details")
    public ResponseEntity getUsers(){
        ResponseEntity responseEntity = null;

        return responseEntity;
    }
}
