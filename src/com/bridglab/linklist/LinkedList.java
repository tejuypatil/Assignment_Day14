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
    public INode<T> search(T searchData) {
        INode<T> temp = head;
        while(temp != null){
            if(temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        INode<T> newNode = new INode<>(insertData);
        INode<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }

    public void popElement(T value){
        INode<T> searchedNode = search(value);
        INode<T> temp = head;
        while(temp.next != searchedNode){
            temp = temp.next;
        }
        temp.next = searchedNode.next;

    }
    public int size(){
        int count=0;
        INode<T> temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}

