package com.Cybersoft.Exercise1SpringBoot09.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
