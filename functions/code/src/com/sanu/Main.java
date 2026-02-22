//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.sanu;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        sum();
    }


    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st number");
        int num1 = sc.nextInt();
        System.out.println("2nd number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum " + sum);
            return sum;
//        System.out.println();
    }


}

