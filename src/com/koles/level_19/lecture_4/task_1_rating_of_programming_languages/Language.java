/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_4.task_1_rating_of_programming_languages;

/**
 *
 * @author User
 */
public class Language {
    
    private String name;
    private Double ranking;
    
    public Language(String name, Double ranking){
        this.name = name;
        this.ranking = ranking;
    }
    
    public String getName(){
        return name;
    }
    
    public Double getRanking(){
        return ranking;
    }
    
    @Override
    public String toString(){
        return "Язык программирования - " + name + ", рейтинг - " + 
                ranking + " % щпрошенных.";
    }
    
}
