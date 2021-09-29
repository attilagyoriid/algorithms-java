package com.ag.algorithms.numbers;

public class Palindrome {

    public boolean checkIsPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return originalNumber == reverse;

    }
}
