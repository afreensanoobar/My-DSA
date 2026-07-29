package com.LinkedList;

class Node {
    int val;
    Node next;// default value null
    Node(int val) {
        this.val = val;
    }
}
    class LinkedList {
        Node head;
        Node tail;
        int size;

        int search(int val) {
            if (head == null) return -1;
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.val == val) {
                    return idx;
                }

                temp = temp.next;
            }
            return -1;
        }
        void addAtTail(int val) {
            Node temp = new Node(val);
            if (tail == null) head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void addAtHead(int val) {
            Node temp = new Node(val);
            if (tail == null) head = tail = temp;
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void deleteAtHead() {
            if (head == null) {
                System.out.println("empty");
                return;
            }
            head = head.next;
            if (head == null) tail = null;
            size--;
        }
        void display() {
            if (head == null) return;
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");

                temp = temp.next;
            }
            System.out.println();
        }
        void insert(int val, int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid index");
            } else if (idx == 0) addAtHead(val);
            else if (idx == size) addAtTail(val);
            else {
                Node temp = head;
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                Node t = new Node(val);
                t.next = temp.next;
                temp.next = t;
                size++;

            }


        }
        int get(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.val;
        }
        void delete(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Index");
                return;
            }
            if (idx == 0) {
                deleteAtHead();
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            if (idx == size - 1) {
                tail = temp;//we are deleteing tail
            }
            size--;
        }
    }
        public class LinkedListDataStructure {
            public static void main(String[] args) {
                LinkedList ll = new LinkedList();
                ll.addAtTail(10);
                ll.addAtTail(20);
                ll.addAtTail(30);
                ll.addAtTail(40);
                ll.addAtTail(50);
                ll.display() ;
                ll.addAtHead(80);
                ll.display();
                System.out.println(ll.size);
                ll.deleteAtHead();
                   ll.display();
                ll.search(87);
                ll.insert(67,3);ll.display();
                System.out.println(ll.get(7));
                ll.delete(4);ll.display();
            }
        }


