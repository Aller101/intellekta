/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jpa;

import com.intellekta.jpa.model.SalesJPA;
import com.intellekta.jpa.service.ServiceJPA;
import java.sql.Date;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author alekseynesterov
 */
//@SpringBootApplication
public class StartApp {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StartApp.class, args);
        ServiceJPA ser = context.getBean(ServiceJPA.class);
        
        
        
        System.out.println("JPA");
        System.out.println(ser.getCountOfProducts());
        System.out.println(ser.getProductById(2));
        System.out.println("");
        
        
        
        List<SalesJPA> list = ser.getSalesWherePriceMoreThan100();
        
    
        for(SalesJPA s:list){
            System.out.println(s);
        }
        
//        SalesJPA sale = new SalesJPA(190, Date.valueOf(String.format("%d-%02d-%02d", 2024,9,2)), Date.valueOf(String.format("%d-%02d-%02d", 2024,10,14)), 29);
//        
//        ser.addSaleToTable(sale);
        

        
    }
}
