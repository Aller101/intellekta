/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

/**
 *
 * @author alekseynesterov
 */
public class CardCustomer extends Customer {

    private final String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void customerInfo() {
        String nl = System.getProperty("line.separator");
        System.out.printf("Customer %s (card: %s) has a discount %d%% %s",
                super.getName(),
                this.getCardNumber(),
                super.getDiscountSize(),
                nl);
    }

    public CardCustomer(String name, int purchaseCount, String cardNumber) {
        super(name, purchaseCount);
        if (!cardNumber.isBlank()) {
            this.cardNumber = cardNumber;
        } else {
            this.cardNumber = "0000000000000000";
        }

    }
}
