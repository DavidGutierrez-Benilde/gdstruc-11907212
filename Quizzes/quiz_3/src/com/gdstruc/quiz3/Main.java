package com.gdstruc.quiz3;

import java.util.Scanner;
import java.util.Random;

public class Main {



    public static void main(String[] args) {

        System.out.println();
        int turn = 1;
        ArrayQueue playerQueue = new ArrayQueue(20);
        Scanner scanner = new Scanner(System.in);

        while (turn < 11) {
            String input = "";
            int randomNumber = rngRange (1, 7);

            System.out.println("=== Start of Turn: " + turn + " ===");

            matchmaking(randomNumber, playerQueue);

            System.out.println("=== End of Turn: " + turn + " ===");

            if (input == scanner.nextLine()) turn++;
        }
    }

    public static void matchmaking (int random, ArrayQueue playerQueue) {

        if (random == 1) System.out.println("Added " + random + " player");
        else System.out.println("Added " + random + " players");

        for (int i = 0; i < random; i++)
        {
            playerQueue.add(new Player(i, "Player " + i, 100));
        }

        System.out.println("\nQueue before Game start: ");
        playerQueue.printQueue();

        if (playerQueue.size() >= 5)
        {
            System.out.println("\nGame Starting... " + " Removing");
            for (int i = 0; i < 5; i++)
            {
                System.out.println(playerQueue.remove());
            }
            System.out.println ("from queue");
        }
        else
            System.out.println("\nGame cannot start without 5 players");

        System.out.println("\nQueue after Game start: ");
        playerQueue.printQueue();

    }

    public static int rngRange(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
