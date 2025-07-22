package com.Cybersoft.Exercise1SpringBoot09.Controller;

import com.Cybersoft.Exercise1SpringBoot09.Service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("")
    public String getCurrentTime() {
        return timeService.getCurrentTime();
    }

}
