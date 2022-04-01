/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.introduction_to_the_lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Solution {
    
    public Solution(){
        var numbers = new ArrayList<Integer>();
        
        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);
        
        sortNumbers(numbers);
        
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
    
    private void sortNumbers(List<Integer> list){
        Collections.sort(list, (i1, i2) -> i1 - i2);
    }
    
}
