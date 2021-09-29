package com.ag.algorithms.solutions.strings;

import java.util.stream.IntStream;

public class Palindrome {

    public boolean checkIsPalindrome(String text) {

        String textWoPunct = text.replaceAll("\\s+", "").replaceAll("\\p{Punct}+", "").toLowerCase();
        System.out.println(textWoPunct);
        return IntStream.range(0,textWoPunct.length() / 2).noneMatch(i-> textWoPunct.charAt(i) != textWoPunct.charAt(textWoPunct.length()-i-1));

    }
}