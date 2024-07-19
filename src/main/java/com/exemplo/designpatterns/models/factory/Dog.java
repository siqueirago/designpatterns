package com.exemplo.designpatterns.models.factory;


import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Uau! Uau!";
    }
    
}

