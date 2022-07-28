package com.bridglab.linklist;

public class LinkedList<T> {
    INode<T> head;
    INode<T> tail;

    public LinkedList(){
        this.head=null;
        this.tail=null;
    }
     public void push(T data){
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
   public void print(){
        INode<T> temp = head;
        while (temp != null){
            System.out.print(temp.data+ " ");

           temp = temp.next;
        }
    }
    public void insert(T data) {
        INode<T> node = new INode<>(data);
        head.next = node;
        node.next = tail;
    }

    public T pop() {
        T deletedElement = head.data;
        head = head.next;
        return deletedElement;
    }
    public T popLastElement() {
        T deletedElement = tail.data;
        INode<T> temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return  deletedElement;
    }


    public T peek() {

        return null;
    }

    public int size() {
        return 0;
    }

}


