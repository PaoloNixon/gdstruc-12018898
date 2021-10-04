package com.paolonixon;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[15];

        numbers[0] = 57;
        numbers[1] = 24;
        numbers[2] = 35;
        numbers[3] = 7;
        numbers[4] = 89;
        numbers[5] = -14;
        numbers[6] = -59;
        numbers[7] = 37;
        numbers[8] = 99;
        numbers[9] = 17;
        numbers[10] = 44;
        numbers[11] = -56;
        numbers[12] = 26;
        numbers[13] = 84;
        numbers[14] = 71;

        System.out.println("Before bubble sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort:");
        printArrayElements(numbers);

        int[] numbers2 = new int[15];

        numbers2[0] = 57;
        numbers2[1] = 24;
        numbers2[2] = 35;
        numbers2[3] = 7;
        numbers2[4] = 89;
        numbers2[5] = -14;
        numbers2[6] = -59;
        numbers2[7] = 37;
        numbers2[8] = 99;
        numbers2[9] = 17;
        numbers2[10] = 44;
        numbers2[11] = -56;
        numbers2[12] = 26;
        numbers2[13] = 84;
        numbers2[14] = 71;

        System.out.println("\n\nBefore selection sort:");
        printArrayElements(numbers2);

        selectionSort(numbers2);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers2);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp =  arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
