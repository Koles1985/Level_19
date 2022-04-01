/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_1.sorted_by_age;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    @Override
    public String toString(){
        return "Студент - " + name + ", возраст - " + age + ".";
    }
    
}
