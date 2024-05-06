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
public class CashCustomer extends Customer {

    private final String documentNumber;

    public CashCustomer(String name, int purchaseCount, String documentNumber) {
        super(name, purchaseCount);
        if ((documentNumber != null) && (!documentNumber.isBlank())) {
            if (documentIsValid(documentNumber)) {
                this.documentNumber = documentNumber;
            } else {
                this.documentNumber = "0000 000000";
            }
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
                (int) (super.getDiscountSize() * 100),
                nl);
    }
// Паттерн для проверки строки **** ******
    public static boolean documentIsValid(String input) {
        String pattern = "\\d{4} \\d{6}";
        return Pattern.matches(pattern, input);
    }

}
