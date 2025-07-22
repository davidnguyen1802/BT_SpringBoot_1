package com.Cybersoft.Exercise1SpringBoot09.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {
    @GetMapping("")
    public String sum(@RequestParam int a, @RequestParam int b) {
        return "The sum of " + a + " and " + b + " is: " + (a+b);
    }
}
