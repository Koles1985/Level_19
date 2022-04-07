/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_7.task_4_from_stream_to_string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    
    public Solution(){
        var stringStream = Stream.of("To", "be", "a", "programming", "you",
                "need", "to", "code");
        
        System.out.println(getString(stringStream));
    }
    
    private String getString(Stream<String> stream){
        return stream.collect(Collectors.joining(" "));
    }
    
}
