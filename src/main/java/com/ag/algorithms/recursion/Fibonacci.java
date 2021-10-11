package com.ag.algorithms.recursion;

public class Fibonacci {

    public int calculate(int num) {

        if (num < 2) {
            return num;
        }

        return calculate(num - 1) + calculate(num - 2);

    }

    public int calculateIteratively(int num) {

        if (num < 2) {
            return num;
        }
        int[] nums = new int[num + 1];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i <= num; i++) {

            nums[i] = nums[i - 1] + nums[i - 2];

        }

        return nums[num];

    }
}
