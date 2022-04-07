/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_7.task_1_from_stream_to_list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    public Solution(){
        var numbers = Stream.of(-1, 10, 43, 0, 32, -9, 54);
        getPositiveNumbers(numbers).forEach(System.out::println);
    }
    
    private List<Integer> getPositiveNumbers(Stream<Integer> stream){
        return stream.filter(number -> number > 0)
                .collect(Collectors.toList());
    }
    
}
