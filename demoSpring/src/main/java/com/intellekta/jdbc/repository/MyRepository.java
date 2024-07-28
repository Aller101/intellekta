/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jdbc.repository;

import com.intellekta.jdbc.model.Sales;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
        return jdbcTemplate.queryForObject("select * from SALES where id = ?",
                new SalesMapper(), id);
    }

    public List<Sales> getSalesWherePriceMoreThan100() {
        return jdbcTemplate.query("select * from SALES where price>?", new SalesMapper(),100);
    }

    public void addSaleToTable(Sales sales) {
        if (sales != null) {
            jdbcTemplate.update("insert into SALES(price, date_from, date_to, product) values(?,?,?,?);",
                    sales.getPrice(), sales.getDateFrom(),
                    sales.getDateTo(), sales.getProduct());
        }
    }

    public void addSaleToTable(int price, Date dateFrom, Date dateTo, int product) {
        Sales sales = new Sales(price, dateFrom, dateTo, product);
        jdbcTemplate.update("insert into SALES values(?,?,?,?);",
                sales.getPrice(), sales.getDateFrom(),
                sales.getDateTo(), sales.getProduct());

    }
}
