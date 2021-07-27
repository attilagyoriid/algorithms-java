package com.ag.algorithms.solutions.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public String reverse(String text) {
        char[] chars = text.toCharArray();

        int textLength = text.length() - 1;
        char[] backward = new char[textLength];

        for (int i = textLength; i >= 0; i--) {
            backward[textLength - i] = chars[i];
        }

        return Arrays.toString(backward);
    }

    public String reverse2(String text) {
        List<String> list = Arrays.stream(text.split("")).toList();
        Collections.reverse(list);
        return String.join("", list);
    }
}
