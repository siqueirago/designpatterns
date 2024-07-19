package com.exemplo.designpatterns.models.singleton;

import org.springframework.stereotype.Component;

@Component
public class Singleton {
    private static Singleton instance;
    private String message = "Bem Vindo ao Singleton!";

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
