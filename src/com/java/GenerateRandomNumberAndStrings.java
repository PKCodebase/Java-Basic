package com.java;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class GenerateRandomNumberAndStrings {
    public static void main(String[] args) {
        Random rand = new Random();
        int rnumber = rand.nextInt(10000);  //same as double
        System.out.println(rnumber);


        SecureRandom secureRandom = new SecureRandom();
        int otp = secureRandom.nextInt(900000) + 100000;
        System.out.println(otp);

        int random =  (int)(Math.random()*10000);
        System.out.println(random);


        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
