//ei java class ke spring bean container e register korbo as spring beans but er jonno
//amader xml file lagbena

package com.model;


import org.springframework.beans.factory.annotation.Value;

public class Message {

    @Value(value = "101")
    private int messageId;

    @Value(value = "Hello, this Java based Configuration and setter getter dependency injection")
    private String message;

    //setter getter dependency injection
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", message='" + message + '\'' +
                '}';
    }
}
