/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_2.introduction_to_foreach;

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
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        
        print(numbers);
    }
    
    private static void print(List<Integer> list){
        list.forEach( (Integer i) -> {
            System.out.println(i);
        });
        
        // сокращенная форма записи
        list.forEach( i -> {
            System.out.println(i);
        });
    }
    
}
