package com.ag.algorithms.recursion;

public class Factorial {

    public int calculate(int num) {

        if (num < 2) {
            return num;
        }

        return calculate(num-1) * num;

    }

}
