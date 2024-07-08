package org.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloPrinter {
    public HelloPrinter(){

    }

    public String printHello(){
        return "Hello";
    }
}
