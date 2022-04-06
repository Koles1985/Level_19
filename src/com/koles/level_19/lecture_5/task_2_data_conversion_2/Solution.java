/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_5.task_2_data_conversion_2;

import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class Solution {
    
    public Solution(){
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то",
                "не", "работает.", "Если", "бы", "всё", "работало", "вас",
                "бы", "уволили.");
        
        toUpperCase(stream).forEach(System.out::println);
    }
    
    private Stream<String> toUpperCase(Stream<String> stream){
        return stream.map(String::toUpperCase);
    }
    
}
