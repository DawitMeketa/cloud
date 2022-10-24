package com.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controller {


    @GetMapping
    public List<String> get() {
        return List.of("Hello", "form", "google", "cloud", "run");

    }
}
