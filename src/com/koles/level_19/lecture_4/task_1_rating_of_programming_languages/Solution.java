/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_4.task_1_rating_of_programming_languages;

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
    List<Language> languages = new ArrayList<>();
    Collections.addAll(languages, 
            new Language("C#", 4.33d),
            new Language("JavaScript", 2.54d),
            new Language("Python", 10.33),
            new Language("C++", 7.31),
            new Language("Go", 1.45d),
            new Language("R", 2.36d),
            new Language("Java", 13.45),
            new Language("C", 15.95),
            new Language("Swift", 1.38),
            new Language("PHP", 2.49));
    
    Stream<Language> languageStream = sortByRanking(languages);
    languageStream.forEach(System.out::println);
    }
    
    
    public Stream<Language> sortByRanking(List<Language> list){
       return list.stream()
                    .sorted((lang1, lang2) -> Double.compare(lang2.getRanking(),
                           lang1.getRanking()));
    }
    
}
