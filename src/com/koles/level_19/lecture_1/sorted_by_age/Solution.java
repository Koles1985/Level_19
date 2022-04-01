/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.sorted_by_age;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Solution {
    private List<Student> students = new ArrayList<>();
    
    public Solution(){
        Collections.addAll(students, new Student("Антон", 22),
                new Student("Tom", 18),
                new Student("Brad", 34));
        
        Collections.sort(students, new AgeComparator());
        
        for(Student student : students){
            System.out.println(student);
        }
    }
    
}
