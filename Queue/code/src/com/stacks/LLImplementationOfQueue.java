package com.stacks;

class Node{
    int val;
    Node next;
    Node (int val){
        this.val= val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int size;
    public void  add (int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public int  remove(){
        if(size==0) {
            System.out.println("Empty");
            return -1;
        }
        int front = head.val;
        head= head.next;
        size--;

        return front;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp= temp.next;
        }
    }
}
public class LLImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.remove();
        q.display();
    }

}
