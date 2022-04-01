/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.farewell_to_the_lambda_expression;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        return string1.length() - string2.length();
    }
    
    
    
}
