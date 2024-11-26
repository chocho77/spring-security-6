package com.dailycodebuffer.security.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WelcomeController {

    @GetMapping("")
    public String welcome() {
        return "Welcome to daily Code Buffer";
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");

    }
    

}
