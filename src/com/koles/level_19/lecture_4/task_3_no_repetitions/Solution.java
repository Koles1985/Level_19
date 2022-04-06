/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_4.task_3_no_repetitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class Solution {
    
    public Solution(){
        var words = new ArrayList<String>();
        Collections.addAll(words, "чтобы", "стать", "программистом", "нужно",
        "программировать", "а", "чтобы", "программировать", "нужно", "учиться");
        
        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
        
    }
    
    
    private Stream<String> getDistinctWords(List<String> list){
        return list.stream()
                .distinct();
    }
    
}
