package com.sanu;

public class Shadowing {
    static int x = 90;// this will be overshadowing line a

    public static void main(String[] args) {
        System.out.println(x);//90
        //declaring here
        int x ;// the class variable at line 4 will be shadowed by this
 // err       System.out.println(x);// scope will begin when value is initialised
        x=70;//initialising

        System.out.println(x);//40
        fun();//
    }

    static void fun() {
        System.out.println(x);//90
    }

}
