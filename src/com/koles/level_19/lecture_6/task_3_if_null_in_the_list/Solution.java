/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_6.task_3_if_null_in_the_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    
    public Solution(){
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "seccond", null, "fourth",
                "fifth");
        
        printList(strings);
        
    }
    
    private void printList(List<String> list){
        String textIfElementOfTheListEqualsNull = "Этот элемент равен  null";
        list.forEach(ElementOfTheList -> System.out.println(
            Optional.ofNullable(ElementOfTheList)
                .orElse(textIfElementOfTheListEqualsNull))
        );
         
    }
    
}
