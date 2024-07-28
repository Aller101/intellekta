/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author alekseynesterov
 */


@Getter
@Setter
@ToString
@Entity
@Table(name = "SALES")
public class SalesJPA {
    
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private int price;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_to")
    private Date dateTo;

    @Column(name = "product")
    private int product;

    public SalesJPA(int price, Date dateFrom, Date dateTo, int product) {
        this.price = price;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.product = product;
    }

    public SalesJPA() {
    }
    
    
    
    
}
