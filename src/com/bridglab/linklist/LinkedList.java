package com.bridglab.linklist;

public class LinkedList<T> {
    INode<T> head;
    INode<T> tail;
    public void add(T key) {
        INode<T> newNode = new INode<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        INode<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

}
