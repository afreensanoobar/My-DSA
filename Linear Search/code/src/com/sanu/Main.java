package com.sanu;

public class Main {
    public static void main(String[] args) {
        int[] nums = {89, 78, 67, 56, 65, 45, 34};
        int target = 67;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch2(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        //run for a loop

        for (int index = 0; index < arr.length; index++) {
            //check fro elemnt at eevry index

            int element = arr[index];
            if (element == target) {
                return element;
            }


        }

        //this line will execute if none of the return stattements above has executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }
    //search the target and return the element





    //search in array:return the index if item found
    //otherwise if not found return -1
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        //run for a loop

        for (int index = 0; index < arr.length; index++) {
            //check fro elemnt at eevry index

            int element = arr[index];
            if (element == target) {
                return index;
            }


        }

        //this line will execute if none of the return stattements above has executed
        //hence the target not found
        return -1;
    }


    }