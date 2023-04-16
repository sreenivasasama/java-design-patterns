package com.sreeni.creational.factory;

public class XMLMessage extends Message{
    @Override
    public String getContent() {
        return "XML message created";
    }

    XMLMessage() {
        System.out.println("XML Message created");
    }
}
