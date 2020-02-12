package com.learn.algorithms.sorting;

public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        int iterations = 0;
        for (int i = 0; i < n - 1; i++) {
            iterations++;
            for (int j = 0; j < n - i - 1; j++) {
                iterations++;
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    iterations++;
                }
            }
        }
        System.out.println("Other Method iterations " + iterations);
    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void mymethod(int numbers[]) {
        int iterations = 0;
        int arraySize = numbers.length;
        for (int i = 0; i < arraySize; i++) {
            iterations++;
            for (int j = i + 1; j < arraySize; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    iterations++;
                }
            }
        }
        System.out.println("My code iterations " + iterations);
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {2, 1, 5, 6, 9, 7, 0, 1, 3, 2};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        int arr1[] = {2, 1, 5, 6, 9, 7, 0, 1, 3, 2};
        ob.mymethod(arr1);
        ob.printArray(arr1);

    }


}
