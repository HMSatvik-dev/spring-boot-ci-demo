package com.SatvikApp.simple_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String hello() {
        return "Mahesh------------Welcome to Satvik's Testing Application-------";
    }

}
