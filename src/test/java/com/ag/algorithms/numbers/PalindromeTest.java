package com.ag.algorithms.numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void checkIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        Assertions.assertThat(palindrome.checkIsPalindrome(1244214)).isFalse();
        Assertions.assertThat(palindrome.checkIsPalindrome(124421)).isTrue();
    }
}