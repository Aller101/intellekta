/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

/**
 *
 * @author alekseynesterov
 */
public abstract class Customer {

    private String name;
    private int purchaseCount;
    private int discountSize;

    public Customer(String name, int purchaseCount) {
        if ((name != null) && (!name.equals(""))) {
            this.name = name;
        } else {
            this.name = "No-name";
        }
        if (purchaseCount > 0) {
            this.purchaseCount = purchaseCount;
        }else{
        this.purchaseCount = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getDiscountSize() {
        if (purchaseCount > 4) {
            if (purchaseCount < 10) {
                if (purchaseCount < 15) {
                    return 10;
                } else {
                    return 20;
                }
            } else {
                return 5;
            }
        } else {
            return 0;
        }
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public abstract void customerInfo();


    

}
