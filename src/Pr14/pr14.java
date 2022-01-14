package Pr14;

public class pr14 {
    static int triangle(int n) {
        int total = 0;
        for (int index = 0; index < n + 1; index++) {
            total = total + index;
        }
        return total;
    }
    public static void main(String args[]) {
        for (int x = 1; x < 100; x++)
            System.out.println(triangle(x));
    }
}