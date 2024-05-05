/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

/**
 *
 * @author alekseynesterov
 */
public class CashCustomer extends Customer {

    private final String documentNumber;

    public CashCustomer(String name, int purchaseCount, String documentNumber) {
        super(name, purchaseCount);
        if (!documentNumber.isBlank()) {
            this.documentNumber = documentNumber;
        } else {
            this.documentNumber = "0000 000000";
        }
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public void customerInfo() {
        String nl = System.getProperty("line.separator");
        System.out.printf("Customer %s (passport: %s) has a discount %d%% %s",
                super.getName(),
                this.getDocumentNumber(),
                super.getDiscountSize(),
                nl);
    }

}
