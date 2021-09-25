package com.ag.algorithms.solutions.search;

public class BinarySearch {
    public int search(int[] listToSearch, int valueToFind, int start, int end) {

        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (listToSearch[mid] == valueToFind) {
            return mid;
        }
        if (valueToFind > listToSearch[mid]) {
            start = mid + 1;


        } else {
            end = mid;


        }
        return search(listToSearch, valueToFind, start, end);


    }

}
