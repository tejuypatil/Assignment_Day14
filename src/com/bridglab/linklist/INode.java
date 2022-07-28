package com.bridglab.linklist;
public class INode <K>{
    K data;
    INode<K>next;
    INode<K>prev;
    public INode(){

    }
    public INode(K data){
        this.data= data;
    }

    public void setNext(INode myNode) {
    }
}

