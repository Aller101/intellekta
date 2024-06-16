/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 *
 * @author alekseynesterov
 */

public class Reports {

    @ToRelease
    public static void Report1() {
        System.out.println("Report1");
    }

    @ToRelease(customerName = "Div_2")
    public static void Report2() {
        System.out.println("Report2");
    }
    @ToRelease
    public static void Report3() {
        System.out.println("Report3");
    }

    @ToRelease(customerName = "Div_2")
    public static void Report4() {
        System.out.println("Report4");
    }

    @ToRelease(customerName = "Div_5", version = 5)
    public static void Report5() {
        System.out.println("Report5");
    }

    @ToRelease(customerName = "Div_2")
    public static void Report6() {
        System.out.println("Report6");
    }

    @ToRelease
    public static void Report7() {
        System.out.println("Report7");
    }

    @ToRelease(customerName = "Div_2")
    public static void Report8() {
        System.out.println("Report8");
    }

    @ToRelease
    public static void Report9() {
        System.out.println("Report9");
    }

    @ToRelease(customerName = "Div_5", version = 5)
    @ToRelease(customerName = "Div_2")
    public static void Report10() {
        System.out.println("Report10");
    }


}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ToReleases.class)
@interface ToRelease {

    String customerName() default "";

    int version() default 0;
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface ToReleases {

    ToRelease[] value();
}
