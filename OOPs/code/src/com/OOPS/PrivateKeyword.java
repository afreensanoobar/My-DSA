package com.OOPS;
import java.util.*;
class Students{
    //[Encapsulation]
    String name ;
    private int rollno;
    double cgpa;
//    private
    public void print (){
        System.out.println(name+" "+cgpa+" "+rollno+" ");
    }
//    public void p(){
//        print();
//    }
    int getRollno(){ // getter
        return rollno;
    }
    int setRollno(int x){ // setter
        rollno = x;
        return x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Students s1= new Students();
        //s1.print(); we cant do this becoz of private
        s1.cgpa=8.9;
        s1.name="Sanu";
//        s1.rollno=45; // error
        s1.setRollno(45);// we can hhere access using getter and setter
        s1.print(); // here we can becoz of we changes method by passing
        Students s2= new Students();
        s2.print();
       // s1.rollno ;// we cant do this because of private modifier outside the method
        System.out.println(s1.getRollno());

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
