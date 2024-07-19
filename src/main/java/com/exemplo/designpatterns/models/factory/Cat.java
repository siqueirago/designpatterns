package com.exemplo.designpatterns.models.factory;


import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Miau";
    }
    
}
