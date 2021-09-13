package com.gdstruc.midterms;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CardStack playerDeck = new CardStack("Deck of Cards");
        CardStack discardPile = new CardStack("Discard Pile");
        CardStack playerHand = new CardStack("Player's hand");

        for (int i = 1; i <= 30; i++) {
            playerDeck.push(new Card(i, "Card No. " + i));
        }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (playerDeck.getCardStackSize() > 0) {
            int input;
            do {
                System.out.println();
                System.out.println("Input a number: ");
                System.out.println("0 --> Draw x amount of cards from deck (x ranging from 1 - 5)");
                System.out.println("1 --> Discard x amount of cards to discard pile (x ranging from 1 - 5)");
                System.out.println("2 --> Get x amount of cards from discard pile  (x ranging from 1 - 5)");

                input = scanner.nextInt();

                System.out.println("No picked: " + input);
                System.out.println();

            } while (input > 2 || input < 0);

            int randomInteger = random.nextInt(5 + 1 - 1) + 1;

            switch (input) {
                case 0 -> // Player draws x amount of cards from deck

                        drawCard(randomInteger, playerDeck, playerHand);
                case 1 -> // Player discards x amount of cards to discard pile

                        drawCard(randomInteger, playerHand, discardPile);
                case 2 -> // Player gets x amount of cards from discard pile

                        drawCard(randomInteger, discardPile, playerHand);
            }

            System.out.println();
            playerHand.printStack();
            System.out.println();
            playerDeck.printStack();
            System.out.println();
            discardPile.printStack();
        }
    }

    public static void drawCard(int count, CardStack getCard, CardStack receiveCard)
    {
        int cardCounter;
        if (getCard.isEmpty())
        {
            System.out.println(getCard.getStackName() + " is empty"); return;
        }

        for (cardCounter = 0; cardCounter < count; cardCounter++)
        {
            if (getCard.isEmpty()) break;
            receiveCard.push(getCard.pop());
        }

        if (cardCounter == 1)
            System.out.println(receiveCard.getStackName() + " receives " + cardCounter + " card from the " + getCard.getStackName());
        else
            System.out.println(receiveCard.getStackName() + " receives " + cardCounter + " cards from the " + getCard.getStackName());
    }
}
