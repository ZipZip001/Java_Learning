package com.example.Learn1.testRoutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRoute {
    @GetMapping("/")
    public String sayHello(){
        return "sayHello";
    }
    @GetMapping("/work")
    public String goToWork(){
        return "go to work";
    }
    @GetMapping("/rest")
    public String haveARest(){
        return "Please Res";
    }
}
