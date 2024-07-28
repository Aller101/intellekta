/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jdbc;

import com.intellekta.jdbc.repository.MyRepository;
import com.intellekta.jdbc.configuration.MyConfig;
import com.intellekta.jdbc.model.Sales;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author alekseynesterov
 */
//@SpringBootApplication
public class StartApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        MyRepository rep = context.getBean(MyRepository.class);
        System.out.println("JDBC");
        System.out.println(rep.getCountOfProducts());
        System.out.println(rep.getProductById(4));
        System.out.println("");
        
        List<Sales> list = rep.getSalesWherePriceMoreThan100();
        
    
        for(Sales s:list){
            System.out.println(s);
        }
        
//        Sales s = new Sales(32, Date.valueOf(String.format("%d-%02d-%02d", 2024,12,12)), Date.valueOf(String.format("%d-%02d-%02d", 2024,12,14)), 24);  
//        rep.addSaleToTable(s);
 
                
        context.close();

    }
}


