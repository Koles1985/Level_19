/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_6.task_4_most_expensive_car;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Koles
 */
public class Solution {
    
    public Solution(){
        var tesla = Stream.of(
            new Car("Model S", 94_490),
            new Car("Model 3", 50_690),
            new Car("Model X", 99_690),
            new Car("Model Y", 65_000)
        );
        
        var bmv = Stream.of(
            new Car("X5", 110_000),
            new Car("X3", 54_000),
            new Car("X7", 143_000),
            new Car("X6", 125_000)
        );
        
        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);
        
        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(
                car -> getMoreExpensiveCar(bmv, car));
        moreExpensiveCar.ifPresent(System.out::println);
        
    }
    
    private Optional<Car> getMostExpensiveCar(Stream<Car> stream){
        return stream.max((car1, car2) -> car1.getPrice() - car2.getPrice());
        
        
    }
    
    private Optional<Car> getMoreExpensiveCar(Stream<Car> stream, 
            Car mostExpensiveCar){
        return stream.filter(car -> 
                car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
        
        
        
    }
    
}
