/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_3.task_1_getting_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class Solution {
    public Solution(){
        
    List<String> strings = new ArrayList<>();
    Collections.addAll(strings, "Зима", "Весна", "Summer", "Spring");
    Stream<String> stringStream = getStreamForArrayList(strings);
    stringStream.forEach(System.out::println);
    
    Integer[] integers = {12, 33, 43, 76, 943};
    Stream<Integer> integerStream = getStreamForArray(integers);
    integerStream.forEach(System.out::println);
  
    }
    
    private Stream<String> getStreamForArrayList(List<String> list){
        return list.stream();
    }
    
    private Stream<Integer> getStreamForArray(Integer[] array){
        return Arrays.stream(array);
    }
}
