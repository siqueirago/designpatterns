package com.exemplo.designpatterns.models.factory;


import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {
    public Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Tipo de animal desconhecido");
        }
    }
}

