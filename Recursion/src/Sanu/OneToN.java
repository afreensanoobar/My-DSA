package Sanu;

import java.util.*;

import  java.lang.*;

 public class OneToN {

     static int n;

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         print(n);
     }
// print in seriel number
     public static void print(int n) {
         if(n==0) return;
         System.out.print(n +" ");
         print(n-1);
        if(n!=1);
        { System.out.print(n + " ");
         }
     }


 }
 // will print in reverse
// public static void print(int n) {
//     if(n==0) return;
//     System.out.println(n);
//     print(n-1);
// }
//     public static void print(int x) {
//         if (x > n) return;
//         System.out.println(x);
//         print(x + 1);
//     }
// }

//Better
// public static void print(int x ,int n) {
//     if (x > n) return;
//     System.out.println(x );
//     print(x + 1 n );
// }
//


