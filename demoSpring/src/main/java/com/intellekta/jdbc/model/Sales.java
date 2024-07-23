/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jdbc.model;

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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sales {
    
    private int id;
    
    private int price;
    
    private Date dateFrom;
    
    private Date dateTo;
    
    private int product;
   
    
}
