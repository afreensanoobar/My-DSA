package com.OOPS;

public class PolyMorphism {
public static class Dogs{
    void speak(){
        System.out.println("bhau");
    }
}
    public static class Cat{
        void speak(){
            System.out.println("meow");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hello");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }

    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cat c = new Cat();
        Pikachu p = new Pikachu();
        Human h = new Human ();

        d.speak();
        c.speak();
        p.speak();
        h.speak();
    }





}
