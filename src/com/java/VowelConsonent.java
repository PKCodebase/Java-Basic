package com.java;

public class VowelConsonent {
    public static void main(String[]args){
        String str = "kaushikk";
        str = str.toLowerCase();
        int v = 0;
        int c = 0;



        for(int i=0;i<str.length();i++){
            char chs = str.charAt(i);
            if(chs=='a' || chs =='e' || chs=='i' || chs=='o'||chs=='u'){
                v++;
            }else{
                c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
    }
}
