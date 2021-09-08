package com.gdstruc.midterms;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {

    private LinkedList<Card> stack;
    private int cardStackSize;
    private String stackName;

    public CardStack(String stackName)
    {
        stack = new LinkedList<Card>();
        this.stackName = stackName;
    }

    public void push (Card card)
    {
        stack.push(card);
        cardStackSize++;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        cardStackSize--;
        return stack.pop();
    }

    public int getCardStackSize() {
        return cardStackSize;
    }

    public String getStackName() {
        return stackName;
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Cards on " + stackName + ": ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
