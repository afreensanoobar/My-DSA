package com.LinkedList;


public class DisplayList {
    public static void displayRec(Node head){
        if(head== null) return;
        System.out.println(head.val);
        displayRec( head.next);

    }
    private static int get(Node head , int idx ){
        Node temp =head;
        for(int i =1; i<=idx; i++){
           temp = temp.next;
        }
        return temp.val;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
//        for (Node temp = head; temp != null; temp = temp.next) {
//            System.out.println(temp.val + " ");
//            temp = temp.next;
//        }
//    }

    }
    public static void main(String[] args) {
        Node a = new Node(10); //a.val = 10;
        Node b = new Node(20); //b.val = 10;
        Node c = new Node(30); //c.val = 10;
        Node d = new Node(56); //d.val = 10;
        Node e = new Node(78); //e.val = 10;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//display(a ) ;
        //displayRec(a);

    }

}



