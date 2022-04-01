/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.farewell_to_the_lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Solution {
   public Solution(){
       var strings = new ArrayList<String>();
       
       Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer",
               "CodeGym");
       
       sortStringsByLength(strings);
       
       for(String string : strings){
           System.out.println(string);
       }
   }
   
   private void sortStringsByLength(List<String> list){
       Collections.sort(list, new StringComparator());
   }
    
}
