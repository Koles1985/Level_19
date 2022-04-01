/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.two_implementation_of_the_same_interface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Solution {
    
    private List<Runnable> list = new ArrayList<>();
    
    public Solution(){
        addToList(new Car());
        addToList(new Plane());
        
        runList();
    }
    
    public void addToList(Runnable runnable){
        list.add(runnable);
    }
    
    public void runList(){
        for(Runnable runnable : list){
            runnable.run();
        }
    }
    
}
