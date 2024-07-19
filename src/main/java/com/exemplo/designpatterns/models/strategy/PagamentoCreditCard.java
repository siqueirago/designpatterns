package com.exemplo.designpatterns.models.strategy;



import org.springframework.stereotype.Component;

@Component
public class PagamentoCreditCard implements EstratagiaPagamento {
    private String cardNumber;

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String pay(int amount) {
        return "Pago " + amount + " usando cartão de crédito terminando com " + cardNumber.substring(cardNumber.length() - 4);
    }
}


