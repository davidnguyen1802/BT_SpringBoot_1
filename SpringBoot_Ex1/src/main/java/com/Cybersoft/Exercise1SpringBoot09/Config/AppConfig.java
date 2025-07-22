package com.Cybersoft.Exercise1SpringBoot09.Config;

import com.Cybersoft.Exercise1SpringBoot09.Service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TimeService timeService(){
        return new TimeService();
    }


}
