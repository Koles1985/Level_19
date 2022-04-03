/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_2.farewell_to_foreach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Koles
 */
public class Solution {
    
    public Solution(){
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "javaRush", "CodeGym");
        
        print(strings);
    }
    
    private void print(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
}
