/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

import java.util.List;

/**
 *
 * @author alekseynesterov
 */
public class ViewerStatistics {
    
    public static int averageAge(List<Viewer> list) {
        
        int averageAge = 0;
        
        int numberOfViewers = 0;
        
        if (list == null || list.isEmpty()) {
            return 0;
        } else {
            for (Viewer viewer : list) {
                if (viewer != null) {
                    averageAge += viewer.getAge();
                    numberOfViewers++;
                }
            }
        }
        
        return Math.round(averageAge / numberOfViewers);
    }
}
