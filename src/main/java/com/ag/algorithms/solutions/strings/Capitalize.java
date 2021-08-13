package com.ag.algorithms.solutions.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Capitalize {


    public String capitalize (String text) {

        return Arrays.stream(text.split("\\s+")).map(this::setFirstLetterToUppercase).collect(Collectors.joining(" "));

    }

    private String setFirstLetterToUppercase(String s) {

        s = s.strip();
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
