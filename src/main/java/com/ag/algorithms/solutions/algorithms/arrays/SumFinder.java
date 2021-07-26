package com.ag.algorithms.solutions.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumFinder {


    public boolean findPairAddUpToExpectedValue(ArrayList<Integer> list, int sum ) {

        Set<Integer> complement = new HashSet<>();
        for (Integer item : list) {
            if (complement.contains(item)) {
                return true;
            }
            complement.add(sum-item);
        }

        return false;

    }



}
