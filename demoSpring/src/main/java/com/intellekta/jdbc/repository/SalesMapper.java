/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.jdbc.repository;

import com.intellekta.jdbc.model.Sales;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author alekseynesterov
 */
public class SalesMapper implements RowMapper<Sales>{

    @Override
    public Sales mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sales s = new Sales();
        
        s.setId(rs.getInt("id"));
        s.setPrice(rs.getInt("price"));
        s.setDateFrom(rs.getDate("date_from"));
        s.setDateTo(rs.getDate("date_to"));
        s.setProduct(rs.getInt("product"));
        return s;
      }
    
    
    
      
}
