/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.mentors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Solution {
    
    private List<Mentor> mentors = new ArrayList<>();
    
    public Solution(){
        Collections.addAll(mentors, 
                new Mentor("Jon Bobrov"),
                new Mentor("Risha"),
                new Mentor("Eleonora Carry"),
                new Mentor("Hans Hudls"),
                new Mentor("Kim"),
                new Mentor("Hulio Siesta"),
                new Mentor("Diego"),
                new Mentor("Laga Bilaabo"));
        
        Collections.sort(mentors, new NameComparator());
        
        for(Mentor mentor : mentors){
            System.out.println(mentor);
        }
    }
}
