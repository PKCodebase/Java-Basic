package com.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static String duplicatString(String str[]){
      Set<String> value =  new HashSet<>();
      for(String s:str){
          value.add(s.toLowerCase());

      }
      return value.toString();
    }

    public static void main(String[] args) {
        String[] str = {"Hello" ,"World","hello"};
        System.out.println(duplicatString(str));


    }
}
