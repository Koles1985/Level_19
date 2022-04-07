/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_7.task_2_from_stream_to_set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    
    public Solution(){
        var stringStream = Stream.of("Java Rush", "CodeGym", "Amigo", "Elly",
                "Kim", "Risha");
        
        getFilteredStrings(stringStream).forEach(System.out::println);
    }
    
    private Set<String> getFilteredStrings(Stream<String> stream){
        return stream.filter(text -> text.length() > 6)
                .collect(Collectors.toSet());
    }
    
}
