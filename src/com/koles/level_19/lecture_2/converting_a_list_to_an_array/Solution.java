/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_2.converting_a_list_to_an_array;

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
        Collections.addAll(strings, "Ты", "ж", "программист");
        
        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 33214, 213345);
        
        String[] stringArray = toStringArray(strings);
        for(String string : stringArray){
            System.out.println(string);
        }
        
        Integer[] integerArray = toIntegerArray(integers);
        for(Integer integer : integerArray){
            System.out.println(integer);
        }
    }
    
    private String[] toStringArray(List<String> list){
        return list.toArray(String[]::new);
    }
    
    private Integer[] toIntegerArray(List<Integer> list){
        return list.toArray(Integer[]::new);
    }
    
}
