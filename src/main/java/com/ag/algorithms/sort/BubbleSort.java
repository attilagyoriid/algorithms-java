package com.ag.algorithms.sort;

public class BubbleSort {

    /**
     * Bubble sort execution
     * One of the most inefficient algorithms for sorting.
     * Bubble sort is a stable algorithm, because it will preserve the order of
     * the same elements in this 'If': if (intArray[j] > intArray[j + 1]),
     * to be an unstable algorithm we will need to change this algorithm and put
     * '>=' instead of '>' in the 'If'. Change this comparison will do
     * the algorithm swap elements with the same value.
     * It's possible to see by the numbers of 'fors' in the code,
     * if the collection grows, the number of steps will grow too.
     * Big-O: O(N²)
     * @param intArray the array to sort
     * @return sorted array
     */
    public int[] exec(int[] intArray) {

        System.out.println(":::Bubble Sort:::");
        System.out.println("Unsorted array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        sort(intArray);

        System.out.println("\nBubble sorted array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


        return intArray;

    }

    private void sort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] array, int j, int jPlusOne) {
        if (j == jPlusOne) {
            return;
        }

        int temp = array[j];
        array[j] = array[jPlusOne];
        array[jPlusOne] = temp;
    }
}
