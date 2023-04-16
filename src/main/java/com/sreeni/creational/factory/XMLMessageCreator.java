package com.sreeni.creational.factory;

public class XMLMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new XMLMessage();

    }

}
