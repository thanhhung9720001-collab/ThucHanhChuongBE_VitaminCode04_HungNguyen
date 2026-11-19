package org.example.vitamincode_pratice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello_controller {
    @GetMapping("/hello")
    public String doGetMapping(){
        return "index";
    }
}
