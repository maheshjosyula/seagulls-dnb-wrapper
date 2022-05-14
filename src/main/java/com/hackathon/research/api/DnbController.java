package com.hackathon.research.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DnbController {

    @GetMapping("/api/ping")
    public String ping(){
        return "hello";
    }
}
