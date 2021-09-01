package com.gdstruc.quiz1;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        System.out.println("Before Bubble / Selection Sort");
        printArrayElements(numbers);


         bubbleSort(numbers);
        // selectionSort(numbers);

        System.out.println("\n\nAfter Bubble / Selection Sort");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] array)
    {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (array[i] < array[i+ 1]) // modify the bubbleSort to sort in descending order
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] array)
    {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (array[i] < array[smallestIndex])  // modify the selectionSort to sort in descending order, make it look for the smallest value first.
                {
                    smallestIndex = i;
                }
            }

            int temp = array[lastSortedIndex];
            array[lastSortedIndex] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] array)
    {

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
