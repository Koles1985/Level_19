/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_6.task_5_cheapest_car;

/**
 *
 * @author Koles
 */
public class Car {
     private String name;
    private Integer price;
    
    public Car(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
