package com.gdstruc.midterms;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        CardStack playerDeck = new CardStack("Player Deck");
        CardStack discardPile = new CardStack("Discard Pile");
        CardStack playerHand = new CardStack("Player's hand");

        for (int i = 1; i <= 30; i++)
        {
            playerDeck.push(new Card(i, "Card No. " + i));
        }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (playerDeck.getCardStackSize() > 0)
        {
            int input = 0;
            do {
                System.out.println();
                System.out.println("Input a number: ");
                System.out.println("0 --> Draw x amount of cards from deck (x ranging from 1 - 5)");
                System.out.println("1 --> Discard x amount of cards to discard pile (x ranging from 1 - 5)");
                System.out.println("2 --> Get x amount of cards from discarded pile  (x ranging from 1 - 5)");

                input = scanner.nextInt();

                System.out.println("No picked: " + input);
                System.out.println();

            } while (input > 2 || input < 0);

            int randomInteger = random.nextInt(5 + 1 - 1) + 1;

            switch (input)
            {
                case 0: // Player draws x amount of cards from deck

                    if (playerDeck.isEmpty())
                    {
                        System.out.println(playerDeck.getStackName() + " is empty");
                        break;
                    }

                    if (randomInteger == 1)
                        System.out.println("Player draws " + randomInteger + " card");
                    else
                        System.out.println("Player draws " + randomInteger + " cards");

                    for (int i = 1; i <= randomInteger; i++)
                    {
                        if (playerDeck.isEmpty()) break;
                        playerHand.push(playerDeck.peek());
                        playerDeck.pop();
                    }
                    break;

                case 1: // Player discards x amount of cards to discard pile

                    if (playerHand.isEmpty())
                    {
                        System.out.println(playerHand.getStackName() + " is empty");
                        break;
                    }

                    if (randomInteger == 1)
                        System.out.println("Player discards " + randomInteger + " card");
                    else
                        System.out.println("Player discards " + randomInteger + " cards");

                    for (int i = 1; i <= randomInteger; i++)
                    {
                        if (playerHand.isEmpty()) break;
                        discardPile.push(playerHand.peek());
                        playerHand.pop();
                    }
                    break;

                case 2: // Player gets x amount of cards from discard pile

                    if (discardPile.isEmpty())
                    {
                        System.out.println(discardPile.getStackName() + " is empty");
                        break;
                    }

                    if (randomInteger == 1)
                        System.out.println("Player gets " + randomInteger + " card from discard pile");
                    else
                        System.out.println("Player gryd " + randomInteger + " cards from discard pile");

                    for (int i = 1; i <= randomInteger; i++)
                    {
                        if (discardPile.isEmpty()) break;
                        playerHand.push(discardPile.peek());
                        discardPile.pop();
                    }
                    break;
            }

            System.out.println();
            playerHand.printStack();
            System.out.println();
            playerDeck.printStack();
            System.out.println();
            discardPile.printStack();
        }
    }
}
