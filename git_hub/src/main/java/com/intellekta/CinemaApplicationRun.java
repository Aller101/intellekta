/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alekseynesterov
 */

public class CinemaApplicationRun {
    
    
    public static void main(String[] args) {
        
        ArrayList<Viewer> lists = new ArrayList<>(List.of(
                
                new Viewer("Ola", 12, List.of(new Cinema("swsw","wsws",2.2),new Cinema("wvrvrvrv","nyn", 1.2))),
                new Viewer("Kola", 13, List.of(new Cinema())),
                new Viewer("Tolia", 38, null),
                new Viewer("Sam", 56, List.of(new Cinema("12","12",4),new Cinema("23","23",3),new Cinema("34","34",2.4),new Cinema("45","45",1),new Cinema("56","56",3))),
                new Viewer("Tanuxa", 47, List.of(new Cinema(), new Cinema("sese","ccd",5)))
                
        ));

        System.out.println(ViewerStatistics.averageAge(lists));
    }
    
    
}
