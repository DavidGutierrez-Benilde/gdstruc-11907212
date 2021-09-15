package com.gdstruc.module6;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {68, 33, 12, 64, 17, 105, -53};

        //System.out.println(linearSearch(numbers, 105));
        //System.out.println(linearSearch(numbers, 420));
        System.out.println(binarySearch(numbers, 33));
        System.out.println(binarySearch(numbers, 69));
    }

    public static int linearSearch(int[]input, int value)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == value)
                return i;
        }

        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (input[middle] == value)
                return middle;
            else if (value < input[middle]) // value might be at left
                end = middle - 1;
            else if (value > input[middle]) // value might be at right
                start = middle + 1;
        }

        return -1;
    }

}
