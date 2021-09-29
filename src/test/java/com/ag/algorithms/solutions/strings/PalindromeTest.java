package com.ag.algorithms.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void checkIsPalindrome() {
        String text = "Is Racecar SI!";

        Palindrome palindrome = new Palindrome();
        Assertions.assertThat(palindrome.checkIsPalindrome(text)).isTrue();


    }
}