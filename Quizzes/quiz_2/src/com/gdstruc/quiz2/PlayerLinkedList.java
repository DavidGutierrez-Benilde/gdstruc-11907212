package com.gdstruc.quiz2;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront (Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeFromFront() // remove the first element of the Linked List
    {
        head = head.getNextPlayer();
    }

    public void listSize()
    {
        int amountOfElements = 0;
        PlayerNode current = head;
        while (current != null)
        {
            amountOfElements++;
            current = current.getNextPlayer();
        }
        System.out.println("No. of elements present in the list: " + amountOfElements);
    }

    public void contains(Player player) // create a contains() function similar to the one found in ArrayList
    {
        PlayerNode current = head;

        while (current.getPlayer() != player)
        {
            current = current.getNextPlayer();

            if (current == null)
                break;
        }

        if (current == null)
            System.out.println(false);
        else
            System.out.println(true);
    }

    public void indexOf(Player player) // create a indexOf() function similar to the one found in ArrayList
    {
        int noBeforeIndex = 0;
        PlayerNode current = head;

        while (current.getPlayer() != player)
        {
            current = current.getNextPlayer();

            if (current == null)
            {
                noBeforeIndex = -1;
                break;
            }
            else
            {
                noBeforeIndex++;
            }
        }

            System.out.println(noBeforeIndex);
    }


    public void printList()
    {
        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null)
        {
            System.out.println(current.getPlayer());
            System.out.print("     -> ");
            current = current.getNextPlayer();
        }

        System.out.println("null");
    }
}
