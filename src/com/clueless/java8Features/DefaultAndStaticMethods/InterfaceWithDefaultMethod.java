package com.clueless.java8Features.DefaultAndStaticMethods;

public interface InterfaceWithDefaultMethod {
    public void M1();
    public void M2();
    default void M3(){
        System.out.println("Default Method");
    }
}
