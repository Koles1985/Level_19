/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_6.task_1_number_flow_analysis;

import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    public Solution(){
        String answerYes = "Yes";
        String answerNo = "No";
        
        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);
        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ?
                answerYes : answerNo;
        System.out.println("Any negative even numbers in the stream? " +
                answerNegativeEvenNumbers);
        
        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);
        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ?
                answerYes : answerNo;
        System.out.println("Only positive numbers in the stream? " + 
                answerOnlyPositiveNumbers);
        
        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -84, -43);
        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ?
                answerYes : answerNo;
        
        System.out.println("Only negative numbers in the stream? " + 
                answerOnlyNegativeNumbers);
    }
    
    private boolean hasNegativeEvenNumbers(Stream<Integer> stream){
        return stream.anyMatch(x -> (x < 0 && x % 2 == 0));
    }
    
    private boolean hasOnlyPositiveNumbers(Stream<Integer> stream){
        return stream.allMatch(x -> x > 0);
    }
    
    private boolean hasOnlyNegativeNumbers(Stream<Integer> stream){
        return stream.noneMatch(x -> x > 0);
    }
    
}
