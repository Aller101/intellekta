/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.controller;

import com.intellekta.jpa.model.SalesJPA;
import com.intellekta.jpa.service.ServiceJPA;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alekseynesterov
 */
@Controller
public class MyController {
    
    private String noname = "noname";
    
    private ServiceJPA serviceJPA;

    public MyController(ServiceJPA serviceJPA) {
        this.serviceJPA = serviceJPA;
    }
    

    @GetMapping("/login")
    public String createUserForm() {
        return "login";
    }

    @PostMapping("/login")
    public String createUser(@RequestParam("name") String name) {
        if (!name.equals("User")) {
            noname = name;
        }
        System.out.println(name);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        List<SalesJPA> sales = serviceJPA.getSalesWherePriceMoreThan100();
        model.addAttribute("name", noname);
        model.addAttribute("sales", sales);
        return "home";
    }

    @PostMapping("/home")
    public String addDataToDb(@RequestParam("price") int price,
            @RequestParam("dateFrom") Date dateFrom,
            @RequestParam("dateTo") Date dateTo,
            @RequestParam("product") int product) 
    {
        SalesJPA sale = new SalesJPA(price, dateFrom, dateTo, product);
        System.out.println(sale);
        serviceJPA.addSaleToTable(sale);
        return "redirect:/home";
    }

}
