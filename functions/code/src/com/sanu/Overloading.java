package com.sanu;

public class Overloading {

    public static void main(String[] args) {
        fun(67);
        fun("afreen");
    }


    static void fun (int a ){
        System.out.println(a);
    }

    static void fun (String name ){
        System.out.println("2");
        System.out.println();
    }
}
