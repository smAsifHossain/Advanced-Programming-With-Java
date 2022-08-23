package com.config;


import com.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //its equivalent to xml file

public class MessageConfig {

    @Bean  //equivalent xml configuration file
    public Message getMessage() //getmessage spring container e register hobe
    {
        return new Message();
    }
}
