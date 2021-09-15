package com.gdstruc.module7;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public void insert(int value)
    {
        if (value == data) return; // doesn't accept duplicate data

        if (value < data)
        {
            if(leftChild == null)
                leftChild = new Node(value);
            else
                leftChild.insert(value);
        }
        else
        {
            if(rightChild == null)
                rightChild = new Node(value);
            else
                rightChild.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (leftChild != null)
            leftChild.traverseInOrder();

        System.out.println("Data: " + data);

        if (rightChild != null)
            rightChild.traverseInOrder();
    }

    public Node(int _data)
    {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public Node get(int value)
    {
        if (value == data)
            return this;

        if (value < data)
        {
            if (leftChild != null)
                return leftChild.get(value);
        }
        else
        {
            if (rightChild != null)
                return rightChild.get(value);
        }

        return null;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
