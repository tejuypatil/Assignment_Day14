package com.bridglab.linklist;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(56);

        linkedList.insert(30);

        System.out.println(linkedList.pop());
        linkedList.print();

}
}
