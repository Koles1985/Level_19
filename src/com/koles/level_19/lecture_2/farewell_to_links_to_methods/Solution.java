/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_2.farewell_to_links_to_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Koles
 */
public class Solution {
    public Solution(){
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 33, 45, 23, 1, 435, 111222);
        
        print(numbers);
    }
    
    private void print(List<Integer> list){
        list.forEach(i -> System.out.println(i));
    }
}
