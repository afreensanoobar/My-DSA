package com.sanu;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//fun(2,3,3,4,5,6);//will print all this and internally store it in an array
  multiple( 2, 90, "rahul", "lkjhg");//cannot skip ordering
    }


    static void multiple(int a , int b , String...v){

    }
    static void fun (int ...v){ //internally taking array of integers or if we use Strings then give aRR OF STRINGS
        System.out.println(Arrays.toString(v));
    }
}
