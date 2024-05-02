/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

/**
 *
 * @author alekseynesterov
 */
public class CashCustomer extends Customer{

    private int documentNumber;

    public CashCustomer(String name, int purchaseCount, int documentNumber) {
        super(name, purchaseCount);
        this.documentNumber = documentNumber;
    }

  

    public int getDocumentNumber() {
        return documentNumber;
    }
    
    @Override
    public void customerInfo() {
        System.out.printf("Customer %s (passport: %x) has a discount %x% \n"
                , super.getName()
                , this.getDocumentNumber()
                , super.getDiscountSize());
    }

//    @Override
//    public String toString() {
//        return "CashCustomer{" + "documentNumber=" + documentNumber + '}';
//    }

  
    
}