package com.Cybersoft.Exercise1SpringBoot09.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class HelloController {
    @GetMapping("/{username}")
    public String hello(@PathVariable String username,
                        @RequestParam String lang){
        if("vi".equalsIgnoreCase(lang)){
            return "Xin chào, " + username + "!";
        } else if ("en".equalsIgnoreCase(lang)){
            return "Hello, " + username + "!";
        } else{
            return "Language not supported!";
        }
    }
}
