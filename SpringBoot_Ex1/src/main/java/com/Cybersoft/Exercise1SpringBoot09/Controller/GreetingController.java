package com.Cybersoft.Exercise1SpringBoot09.Controller;

import com.Cybersoft.Exercise1SpringBoot09.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("")
    public String sayHello(@RequestParam String name) {
        return greetingService.sayHello(name);
    }
}
