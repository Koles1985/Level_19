/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_7.task_3_from_stream_to_map;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    
    public Solution(){
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly",
                "Kim", "Risha");
        
        getMap(stringStream).forEach((key, value) -> System.out.println(key +
                " - " + value));
    }
    
    private Map<String, Integer> getMap(Stream<String> stream){
        return stream.collect(Collectors.toMap(text -> text, 
                text -> text.length())); 
        
        /*
        or
        return stream.collect(Collectors.toMap(text -> text, 
        String::length); 
        */
    }
    
    
}
