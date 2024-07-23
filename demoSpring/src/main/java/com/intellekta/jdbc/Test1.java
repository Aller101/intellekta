///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.intellekta.jdbc;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Properties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.core.io.support.PropertiesLoaderUtils;
//
///**
// *
// * @author alekseynesterov
// */
//
//@Configuration
//@ComponentScan
//public class Test1 {
//
//    
//    @Autowired
//    private ResourceLoader resourceLoader;
//
//
//    public void start() {
//
//        Properties properties = new Properties();
//
//        Resource resource = resourceLoader.getResource("classpath:application.properties");
//        try {
//            properties = PropertiesLoaderUtils.loadProperties(resource);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        String url = properties.getProperty("db.url");
//        String user = properties.getProperty("db.username");
//        String password = properties.getProperty("db.password");
//
//        try {
//            Connection connection = DriverManager.getConnection(url, user, password);
//
//            Statement statement = connection.createStatement();
//
//            String query = "select * from SALES";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()) {
//                System.out.println("");
//                System.out.print("column 1: " + resultSet.getString(1));
//                System.out.print(" column 2: " + resultSet.getString(2));
//                System.out.print(" column 3: " + resultSet.getString(3));
//                System.out.print(" column 4: " + resultSet.getString(4));
//                System.out.print(" column 5: " + resultSet.getString(5));
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test1.class);
//        
//        Test1 test = context.getBean(Test1.class);
//        test.start();
//        context.close();
//        
//    }
//
//}
