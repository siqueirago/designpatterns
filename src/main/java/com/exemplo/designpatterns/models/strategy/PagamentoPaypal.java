package com.exemplo.designpatterns.models.strategy;



import org.springframework.stereotype.Component;

@Component
public class PagamentoPaypal implements EstratagiaPagamento {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String pay(int amount) {
        return "Pago " + amount + " usando o cartão PayPal conta " + email;
    }
}


