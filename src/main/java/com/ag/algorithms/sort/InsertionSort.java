package com.ag.algorithms.sort;

public class InsertionSort {

    /**
     * Insertion sort execution
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

        for (int i = 0; i < intArray.length; i++) {

            for (int j = 0; j < intArray.length - i - 1; j++) {

                if (intArray[j] > intArray[j+1]) {
                    swap(intArray,j,j+1);
                }
            }

        }
        return intArray;

    }

    private void swap(int[] intArray, int i, int j) {
        int temp = intArray[j];
        intArray[j] = intArray[i];
        intArray[i] = temp;

    }

}
