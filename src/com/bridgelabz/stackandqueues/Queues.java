package com.bridgelabz.stackandqueues;
import com.bridglab.linklist.*;
public class Queues <T>{
    LinkedList<T> linkedList;

    public Queues() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.print();
    }

}
