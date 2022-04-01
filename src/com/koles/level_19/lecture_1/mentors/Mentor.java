/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.mentors;

/**
 *
 * @author User
 */
public class Mentor {
    
    private String name;
    
    public Mentor(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Ментор по имени - " + name;
    }
    
}
