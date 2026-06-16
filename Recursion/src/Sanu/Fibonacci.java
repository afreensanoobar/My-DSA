package Sanu;
import java.util.Scanner;

public class Fibonacci {

    public static int nthFibonacci(int n) {
        if (n == 0 || n == 1)
            return n;

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();


        int ans = nthFibonacci(n);
        System.out.println(ans);
    }
}
