package com.service;

public class Communication{

    private Messaging message;

    //constructor dependency injection
    public Communication(Messaging message)
    {
        super();
        this.message=message;
    }

    public void communicate() {

        message.sendMessage();
    }

}
