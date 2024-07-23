/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jdbc.repository;

import com.intellekta.jdbc.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alekseynesterov
 */
@Repository
public class MyRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCountOfProducts() {
        return jdbcTemplate.queryForObject("select count(*) from SALES", Integer.class);
    }

    public Sales getProductById(int id) {
        try {
            return jdbcTemplate.queryForObject("select * from SALES where id = ?", 
                new BeanPropertyRowMapper<>(Sales.class),
                id
            );
        } catch (org.springframework.dao.EmptyResultDataAccessException e) {
            System.out.println("Product with id: " + id + " does not exist");
            return null;
        }
    }
}
