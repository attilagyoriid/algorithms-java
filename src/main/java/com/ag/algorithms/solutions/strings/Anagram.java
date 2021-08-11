package com.ag.algorithms.solutions.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {

    public boolean compute(String str1, String str2) {


        String letterOnly1 = getLetterOnly(str1);
        String letterOnly2 = getLetterOnly(str2);

        Map<String, Integer> charMap1 = getCharMap(letterOnly1);
        Map<String, Integer> charMap2 = getCharMap(letterOnly2);

        if (charMap1.size() != charMap2.size()) {
            return false;
        }
        System.out.println(charMap1);
        System.out.println(charMap2);

        for (String key : charMap1.keySet()) {
            if (!charMap1.get(key).equals(charMap2.get(key))) {
                return false;
            }
        }

        return true;

    }

    public boolean compute2(String str1, String str2) {


        String letterOnly1 = getLetterOnly(str1);
        String letterOnly2 = getLetterOnly(str2);

        String sortedCharactersAsString1 = getSortedString(letterOnly1);
        String sortedCharactersAsString2 = getSortedString(letterOnly2);

        return sortedCharactersAsString1.equals(sortedCharactersAsString2);


    }

    private String getSortedString(String str) {
        return Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
    }

    private static Map<String, Integer> getCharMap(String str) {
        Map<String, Integer> charMap = new HashMap<>();
        Arrays.stream(str.split("")).forEach(i ->
                charMap.merge(i, 1, Integer::sum)
        );

        return charMap;
    }

    private String getLetterOnly(String str) {
        String regex = "[^a-zA-Z]";
        return str.replaceAll(regex, "").toLowerCase();
    }
}
