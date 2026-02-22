package com.sanu;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b =90;

//        int temp = a;
//        a=b;
//        b=temp;
        swap(a,b);

        System.out.println(a +" "+b );

        String name = "afreen";
        changeName(name);
        System.out.println(name);
       // System.out.println(naam); gives error becoz the scope of this variable is functional

    }

    static void swap(int a , int b ){
        int temp =a;
        a=b;
        b=temp;
// no change in output becoz it is just passing the value in int, short, char, byte

// tihis change is only be valid in this functional scope
    }
    static void changeName(String naam){
        naam="Raha";
    }
}
