/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_4.task_2_future_belongs_to_electric_cars;

/**
 *
 * @author User
 */
public class Car {
    private String model;
    private boolean isElectric;
    
    public Car(String model, boolean isElectric){
        this.model = model;
        this.isElectric = isElectric;
    }
    
    public String getModel(){
        return model;
    }
    
    public boolean isElectric(){
        return isElectric;
    }
    
    @Override
    public String toString(){
        return "Car " + model + ", electric - " + isElectric;
    }
    
}
