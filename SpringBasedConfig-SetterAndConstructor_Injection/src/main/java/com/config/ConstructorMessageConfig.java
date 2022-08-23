package com.config;

import com.service.Communication;
import com.service.Messaging;
import com.service.MessagingImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorMessageConfig {

    @Bean
    public Communication communication()
    {
        return new Communication(messaging());
    }

    @Bean
    public Messaging messaging()
    {
        return new MessagingImpl();
    }
}
