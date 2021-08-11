package com.ag.algorithms.solutions.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

class AnagramTest {

    static Anagram anagram;

    @BeforeAll
    static void setUp() {
        anagram = new Anagram();
    }

    @Test
    public void compute1_unhappy() {

        Assertions.assertFalse(anagram.compute("hello", "bello"));

    }

    @Test
    public void compute1_happy() {

        Assertions.assertTrue(anagram.compute("hello", "holle"));

    }
    @Test
    public void compute2_unhappy() {

        Assertions.assertFalse(anagram.compute2("hello", "bello"));

    }

    @Test
    public void compute2_happy() {

        Assertions.assertTrue(anagram.compute2("hello", "holle"));

    }
}