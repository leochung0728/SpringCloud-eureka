package org.example.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
}