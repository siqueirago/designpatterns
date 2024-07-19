package com.exemplo.designpatterns.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exemplo.designpatterns.models.factory.Animal;
import com.exemplo.designpatterns.models.factory.AnimalFactory;
import com.exemplo.designpatterns.models.singleton.Singleton;
import com.exemplo.designpatterns.models.strategy.CarrinhoCompras;
import com.exemplo.designpatterns.models.strategy.PagamentoCreditCard;
import com.exemplo.designpatterns.models.strategy.PagamentoPaypal;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private Singleton singleton;

    @Autowired
    private AnimalFactory animalFactory;

    @Autowired
    private CarrinhoCompras shoppingCart;

    @Autowired
    private PagamentoCreditCard creditCardPayment;

    @Autowired
    private PagamentoPaypal payPalPayment;

    @GetMapping("/singleton")
    public String getSingletonMessage() {
        return singleton.getMessage();
    }

    @GetMapping("/animal")
    public String getAnimalSound(@RequestParam String type) {
        Animal animal = animalFactory.createAnimal(type);
        return animal.makeSound();
    }
    

    @PostMapping("/pay")
    public String makePayment(@RequestParam String method, @RequestParam int amount) {
        if (method.equalsIgnoreCase("creditcard")) {
            creditCardPayment.setCardNumber("1234567890123456");
            shoppingCart.setPaymentStrategy(creditCardPayment);
        } else if (method.equalsIgnoreCase("paypal")) {
            payPalPayment.setEmail("user@example.com");
            shoppingCart.setPaymentStrategy(payPalPayment);
        } else {
            return "Forma de pagamento inválida";
        }
        return shoppingCart.checkout(amount);
    }
}