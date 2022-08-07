package com.bridgelabz.stackandqueues;
import com.bridglab.linklist.*;
public class Queues <T>{
    LinkedList<T> linkedList;

    public Queues() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.print();
    }
    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }
    public T peek(){
        return linkedList.peek();
    }
    public T dequeue() {
        return linkedList.pop();
    }
}

