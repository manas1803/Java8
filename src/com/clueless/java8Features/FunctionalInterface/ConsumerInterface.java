package com.clueless.java8Features.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    public void implementConsumer(){
        Consumer<String> con = (str)-> System.out.println("My name is " + str);

        con.accept("Manas Pant");
    }
}
