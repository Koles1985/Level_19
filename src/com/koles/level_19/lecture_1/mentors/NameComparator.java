/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.mentors;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class NameComparator implements Comparator<Mentor> {

    @Override
    public int compare(Mentor mentor1, Mentor mentor2) {
        return mentor1.getName().length() - mentor2.getName().length();
    }
    
    
    
}
