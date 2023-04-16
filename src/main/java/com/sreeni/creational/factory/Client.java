package com.sreeni.creational.factory;

public class Client {
    public static void main(String[] args) {

        printMessage(new JsonMessageCreator());
    }

    private static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.getMessage();
    }
}
