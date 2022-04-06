/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_5.task_1_data_conversion;

/**
 *
 * @author User
 */
public class Account {
    private String name;
    private String email;
    
    public Account(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
}
