package com.gdstruc.quiz2;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.removeFromFront(); // function that removes the first element
        playerLinkedList.listSize(); // function that checks no. of elements present in linked list
        playerLinkedList.contains(hpDeskjet); // function that acts the same as ArrayList.contains()
        playerLinkedList.indexOf(hpDeskjet); // function that acts the same as ArrayList.indexOf()

        playerLinkedList.printList();
    }
}
