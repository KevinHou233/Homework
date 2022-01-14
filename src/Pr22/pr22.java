package Pr22;

import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("this number is even");

        } else {
            System.out.println("this number is odd" );
        }
    }
}
