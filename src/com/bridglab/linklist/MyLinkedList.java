package com.bridglab.linklist;

public class MyLinkedList {
    public INode tail;
    public INode head;
    public MyLinkedList()
    {
        this.head=null;
        this.tail=null;
        }
public void add(INode newNode){
        if(this.tail==null){
        this.tail=newNode;
        }
        if(this.head==null){
        this.head=newNode;
        }
        else {
        INode tempNode=this.head;
        this.head=newNode;
        this.head.setNext(tempNode);
        }
        }
public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("my Nodes: ");
        INode tempNode=head;
        while (tempNode.getNext()!= null){
        myNodes.append(tempNode.getKey());
        if (!tempNode.equals(tail))myNodes.append("->");
        tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
        }
}