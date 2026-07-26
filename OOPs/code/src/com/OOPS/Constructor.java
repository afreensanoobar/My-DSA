package com.OOPS;

public class Constructor {
    public static class Car{
        int seats;
        String name;
        double length;
        //[CONCEPT OF METHOD OVERLOADING]
        Car(){

        }  //default constructor callled at the time of object creation
       Car(int x , String s, double d){ // parametrised construction
           seats = x ;
           name =s;
           length= d;
       }
       void print (){
           System.out.println(seats+" " + name +" "+length);
       }
    }
    public static void main(String[] args) {
        Car c1 = new Car (5," Kia sonnet", 3.99);
        c1.print();
    }
}
