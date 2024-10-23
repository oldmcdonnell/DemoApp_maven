package com.telusko.DemoApp; // Assuming you want to keep this package

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String greet() {
        return "Hello World";
    }
}
