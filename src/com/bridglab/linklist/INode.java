package com.bridglab.linklist;

public class INode <T>{

    T data;
    INode<T> next;

    public INode() {
    }

    public INode(T data) {
        this.data = data;
    }

}
