/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

/**
 *
 * @author alekseynesterov
 */
public class CardCustomer extends Customer{

    private int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }
    
    @Override
    public void customerInfo() {
            System.out.printf("Customer %s (card: %x) has a discount %x% \n"
                , super.getName()
                , this.getCardNumber()
                , super.getDiscountSize());
    }

    public CardCustomer(String name, int purchaseCount, int cardNumber) {
        super(name, purchaseCount);
        this.cardNumber = cardNumber;
    }

   
    
}
