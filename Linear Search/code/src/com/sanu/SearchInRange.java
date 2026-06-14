package com.sanu;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr ={1,56,67,89,90,45,34,};
        int target =90;
        System.out.println(linearSearch(arr, target, 1,4));
    }
 static int linearSearch (int []arr, int target , int start, int end){
        if(arr.isEmpty){
            return  -1 ;
        }

        // run for loop
     for (int index = start ; index<=end; index++){
         int element = arr[index];

         if (element == target){
             return index;
         }


     }
     //this will execute when none od the above woks
     return -1;
 }
}
