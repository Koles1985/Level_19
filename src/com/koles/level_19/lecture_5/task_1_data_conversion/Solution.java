/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.level_19.lecture_5.task_1_data_conversion;

import java.net.URI;
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
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts, 
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));
        
        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }
    
    private Stream<String> getEmails(List<Account> list){
        return list.stream()
                .map(Account::getEmail);
    }
    
}
