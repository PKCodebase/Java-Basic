package com.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStrings {
    public static void main(String []args){
        String word[] = {"Java","JAVA","Html"};
        Set<String> set = new HashSet<>();
        for(String value:word){
            set.add(value.toLowerCase());
        }
        System.out.println(set);
    }
}
