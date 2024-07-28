/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jpa.repository;

import com.intellekta.jpa.model.SalesJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alekseynesterov
 */
@Repository
public interface RepoJPA extends JpaRepository<SalesJPA, Integer>{
    
}
