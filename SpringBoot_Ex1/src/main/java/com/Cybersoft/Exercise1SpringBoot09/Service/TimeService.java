package com.Cybersoft.Exercise1SpringBoot09.Service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public class TimeService {
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
