package com.exemplo.designpatterns.models.strategy;


import org.springframework.stereotype.Component;

@Component
public class CarrinhoCompras {
    private EstratagiaPagamento paymentStrategy;

    public void setPaymentStrategy(EstratagiaPagamento paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String checkout(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Estratégia de pagamento não definida");
        }
        return paymentStrategy.pay(amount);
    }
}

