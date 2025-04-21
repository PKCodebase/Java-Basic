package com.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static String duplicatString(String str[]){
        Set<String> set = new HashSet<>();
        for(String value:str){
            set.add(value.toLowerCase());
        }
        return set.toString();
    }
    public static void main(String[] args) {
        String[] str = {"Hello","World","hello","HEllo"};
        System.out.println(duplicatString(str));
    }
}
