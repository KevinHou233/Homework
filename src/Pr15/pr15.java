package Pr15;

import java.math.BigInteger;
import java.util.Scanner;

public class pr15 {

    public static void main(String[] args) {
       int number = 2;
       for (int power=0;power<=20;power ++){

        int powerofnumber  = (int) Math.pow(number, power);

        System.out.println(powerofnumber);

    }
}}