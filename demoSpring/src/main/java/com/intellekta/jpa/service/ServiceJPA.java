/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jpa.service;

import com.intellekta.jpa.model.SalesJPA;
import com.intellekta.jpa.repository.RepoJPA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 *
 * @author alekseynesterov
 */
@Service
public class ServiceJPA {

    private RepoJPA repoJpa;

    @Autowired
    public ServiceJPA(@Lazy RepoJPA repo) {
        repoJpa = repo;
    }
    
    public long getCountOfProducts() {
        return repoJpa.count();
    }

    public SalesJPA getProductById(int id) {
        return repoJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product with id: " + id + " does not exist"));
    }
    
    public List<SalesJPA> getSalesWherePriceMoreThan100() {
        return repoJpa.findAll().stream().filter(entity -> entity.getPrice() > 100).toList();
    }
    
    public void addSaleToTable(SalesJPA sale) {
        repoJpa.save(sale);
    }

}
