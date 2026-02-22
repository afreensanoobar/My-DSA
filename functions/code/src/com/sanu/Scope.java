package com.sanu;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//block scope
        {

            // int a=30;cannot intialise it as it is alresdy initialised
            //already iitialised outside the same method, hence cnt ini again

            a=90;// can update the value and here reaasign the original ref variable to some other value
            System.out.println(a);
            int c=99;// value initialised in this block , will remain in block
        //scoping in loops
            for (int j=0;j<4;j++){
                System.out.println(j);
            }
           // System.out.println(j);//gives errorbecoz it initailised in the loop scope


        }
       // System.out.println(c);
        //
        // gives error as c cant be used outside the block


    }
    static void random(int marks){
        int num=89;
            System.out.println(num);
            System.out.println(marks);
        }

    }

