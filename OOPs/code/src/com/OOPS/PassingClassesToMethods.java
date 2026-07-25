package com.OOPS;

public class PassingClassesToMethods {

    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        //creating method within class that will print all things
        void print(){
            System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"nm ");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";
        c.print();
        change(c);
        System.out.println(c.seats);
prints(c);

    }

    private static void change(Car x) {
        x.seats = 4;
    }
    private static void prints(Car c){
        System.out.println(c.name+" " + c.type+" "+c.seats+" ");
    }
}