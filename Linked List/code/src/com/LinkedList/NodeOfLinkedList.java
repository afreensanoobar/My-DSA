package com.LinkedList;

public class NodeOfLinkedList {
     public static void main( String[] args) {
         Node a = new Node(10); //a.val = 10;
         Node b = new Node(20); //b.val = 10;
         Node c = new Node(30); //c.val = 10;
         Node d = new Node(56); //d.val = 10;
         Node e = new Node(78); //e.val = 10;
         System.out.println(c.next);
         a.next = b ;
         b.next = c;
         c.next = d;
         d.next=e;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(a.next.val);// will print same as b means a.next store b
         System.out.println(a.next.next.val);  // will print same a c means it points to c
     }



}
