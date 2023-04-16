package com.sreeni.creational.factory;

public class JsonMessage extends Message{

    JsonMessage() {
        System.out.println("JSON Message created");
    }

    @Override
    public String getContent() {
        return "JSON Message created";
    }
}
