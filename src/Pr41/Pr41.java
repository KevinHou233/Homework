package Pr41;

import java.util.Scanner;

public class Pr41 {

    public static void main(String[] args) {

        int num = 0;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();


                switch (num)
        { case 1:
            System.out.println("that number is for add");
            break;
            case 2:
                System.out.println("that number is for mutiply");
                break;
            default:
                System.out.println("that number is for quit");
    }
}}
