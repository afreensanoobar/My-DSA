package com.OOPS;

 class ComplexNumber {
     int x;
     int y;

     ComplexNumber(int x, int y) {
         this.x = x;
         this.y = y;
     }

     ComplexNumber() {
     }

     void print() {
         if (y >= 0) System.out.println(x + "+" + y + "i");
         else System.out.println(x + "-" + (-y) + "i");
     }

     void add(ComplexNumber z) {
         this.x += z.x;// x = x + z.x(z of x)
         this.y += z.y;
     }

     void mul(ComplexNumber z) {
         x = x * z.x - y * z.y;
         y = x * z.y - y * z.x;
     }


     public class ComplexNumberClass {
         public static void main(String[] args) {
             ComplexNumber z1 = new ComplexNumber(2, -8);
             ComplexNumber z2 = new ComplexNumber(6, -7);
         }
     }
 }
