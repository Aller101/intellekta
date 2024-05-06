/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

import java.util.regex.Pattern;

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
                (int) (super.getDiscountSize() * 100),
                nl);
    }

    public CardCustomer(String name, int purchaseCount, String cardNumber) {
        super(name, purchaseCount);
        if ((cardNumber!=null) && (!cardNumber.isBlank())) {
            if (cardIsValid(cardNumber)) {
                this.cardNumber = cardNumber;
            } else {
                this.cardNumber = "0000000000000000";
            }
        } else {
            this.cardNumber = "0000000000000000";
        }

    }

    // Паттерн для проверки строки на наличие только цифр и длину 16 символов
    public static boolean cardIsValid(String input) {
        String pattern = "\\d{16}";
        return Pattern.matches(pattern, input);
    }
}
