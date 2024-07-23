/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jpa.repository;

import com.intellekta.jpa.model.SalesJPA;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alekseynesterov
 */
@Service
public class RepoJpaImpl {

    private final RepoJpa repoJpa;

    @Autowired
    public RepoJpaImpl(RepoJpa repoJpa) {
        this.repoJpa = repoJpa;
    }

    public long getCountOfProducts() {
        return repoJpa.count();
    }

    public SalesJPA getProductById(int id) {
        return repoJpa.findById(id)
                      .orElseThrow(() -> new IllegalArgumentException("Product with id: " + id + " does not exist"));
    }
}
