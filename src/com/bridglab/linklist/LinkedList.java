package com.bridglab.linklist;

public class LinkedList<T> {
    INode<T> head;
    INode<T> tail;

    public LinkedList(){
        this.head=null;
        this.tail=null;
    }
    void push(T data){
        INode<T> node = new INode<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    public void add(T data) {
        INode<T> node = new INode<>(data);
        if (head == null){
            head = node;
        }
        else{
            tail.next = node;
        }
        tail = node;
    }
    void print(){
        INode<T> temp = head;
        while (temp != null){
            System.out.print(temp.data+ " ");
=
           temp = temp.next;
        }
    }
    public void insert(T data) {
        INode<T> node = new INode<>(data);
        head.next = node;
        node.next = tail;
    }

}


