package com.bridglab.test;

import org.junit.Assert;
import org.junit.Test;
import com.bridglab.linklist.MyNode;
public class TestNode {
    @Test
    public void givenThreeNumWhenLinkedShouldPassLinkedListTest()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
