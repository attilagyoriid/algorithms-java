package com.ag.algorithms.solutions.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ReOccurrenceFinder {

    public Optional<Integer> findFirstReoccurringItem(ArrayList<Integer> list) {
        Set<Integer> complement = new HashSet<>();
        for (Integer item : list) {
            if (complement.contains(item)) {
                return Optional.of(item);
            }
            complement.add(item);
        }

        return Optional.empty();
    }

    public Optional<Integer> findFirstReoccurringItem2(ArrayList<Integer> list) {
        final Set<Integer> complement = new HashSet<>();

        return list.stream().filter(i -> {
            if (complement.contains(i)) {
                return true;
            } else {
                complement.add(i);
                return false;
            }
        }).findFirst();
    }

}
