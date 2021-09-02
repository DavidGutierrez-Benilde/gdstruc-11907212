package com.gdstruc.quiz2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int listSize;

    public void addToFront (Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        listSize++;
    }

    public void removeFromFront() // remove the first element of the Linked List
    {
        head = head.getNextPlayer();
        listSize--;
    }

    public int getListSize()
    {
        return listSize;
    }

    public boolean contains(Player player) // create a contains() function similar to the one found in ArrayList
    {
        PlayerNode current = head;

        while (current.getPlayer() != player)
        {
            current = current.getNextPlayer();

            if (current == null)
                break;
        }

        return current != null;
    }

    public int indexOf(Player player) // create a indexOf() function similar to the one found in ArrayList
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

            return noBeforeIndex;
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
