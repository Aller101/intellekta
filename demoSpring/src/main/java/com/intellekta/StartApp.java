/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

import com.intellekta.jdbc.repository.MyRepository;
import com.intellekta.jdbc.configuration.MyConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author alekseynesterov
 */
@SpringBootApplication
public class StartApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        MyRepository rep = context.getBean(MyRepository.class);
        System.out.println("JDBC");
        System.out.println(rep.getCountOfProducts());
        System.out.println(rep.getProductById(2));
        
                
        context.close();

    }
}


