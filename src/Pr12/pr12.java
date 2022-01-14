package Pr12;

import java.util.Scanner;

public class pr12 {

    public static void main(String[] args) {

        int b = 3;
        System.out.println("step");
        int  a = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        for (int i = 0; i<a; i++) {
            System.out.println(b);
            b=b+2;
        }

    }
}
