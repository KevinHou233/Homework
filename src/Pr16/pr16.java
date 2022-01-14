package Pr16;

import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {

        java.util.Scanner s = new Scanner(System.in);
       int n=s.nextInt();
        int fn=function(n);
        System.out.println("The term of Fibonacci sequence"+ n+ "number is："+fn);
    }
    public static int function(int n){
        if(n==1 || n==2) return 1;
        return function(n-1)+function(n-2);
    }
}


