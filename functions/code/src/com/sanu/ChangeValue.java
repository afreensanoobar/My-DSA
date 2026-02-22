package com.sanu;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
int[] arr={1,2,3,4,5};// when arr ref is passed to the below parameter
change(arr);//the ref itself is passed by value, the value that is being passed refers to the object
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]=99;
// object is modifies via nums
        // some objects are modifies by  num, original object is also modified
    //if you make a change to the object via this ref variable,
    }



}
