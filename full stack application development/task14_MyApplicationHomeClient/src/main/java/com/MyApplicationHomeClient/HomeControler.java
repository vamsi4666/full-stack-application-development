package com.MyApplicationHomeClient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

    @GetMapping("/home")
    public String msg() {
        return "I'm the Home Service. You can create a Home page and display it in your browser.";
    }
}