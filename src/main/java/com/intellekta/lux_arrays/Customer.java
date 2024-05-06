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

    private final String name;
    private int purchaseCount;
    private double discountSize;

    public Customer(String name, int purchaseCount) {
        if ((name != null) && (!name.isBlank())) {
            this.name = name;
        } else {
            this.name = "No-name";
        }
        if (purchaseCount > 0) {
            this.purchaseCount = purchaseCount;
            this.discountSize = discountSize(this.purchaseCount);
        } else {
            this.purchaseCount = 0;
            this.discountSize = 0;
        }
    }

    public String getName() {
        return name;
    }

    public double getDiscountSize() {
      return discountSize(this.purchaseCount);
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        if (purchaseCount > 0) {
            this.purchaseCount = purchaseCount;
        } else {
            this.purchaseCount = 0;
        }
    }

    public abstract void customerInfo();
    
    //размер скидки, учит. кол-во покупок
    public static double discountSize(int purchaseCount){
        if (purchaseCount > 4) {
            if (purchaseCount < 10) {
                if (purchaseCount < 15) {
                    return 0.1;
                } else {
                    return 0.2;
                }
            } else {
                return 0.05;
            }
        } else {
            return 0;
        }
    }
   

}
