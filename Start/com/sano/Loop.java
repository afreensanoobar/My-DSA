package com.sano;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);



    }
}
