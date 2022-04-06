/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_4.task_2_future_belongs_to_electric_cars;

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
        List<Car> cars = new ArrayList<>();
        Collections.addAll(cars, 
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false), 
                new Car("Model 3", true),
                new Car("Cammaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true));
        
        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }
    
    private Stream<Car> onlyElectricCars(List<Car> list){
        return list.stream()
                .filter(car -> (car.isElectric() == true));
        
        /*
        return list.stream()
                .filter(Car::isElectric);
        */
    }
    
}
