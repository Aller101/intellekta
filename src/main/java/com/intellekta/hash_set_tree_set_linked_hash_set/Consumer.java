/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.hash_set_tree_set_linked_hash_set;

/**
 *
 * @author alekseynesterov
 */
public class Consumer {

    private String fullName;

    private String shortName;

    private int country;

    private String uniqueId;

    public Consumer(String fullName, String shortName, int country, String uniqueId) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.country = country;
        this.uniqueId = uniqueId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

}
