package com.ag.algorithms.solutions.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTest {
    private static Capitalize capitalize;

    @BeforeAll
    static void setUp() {
        capitalize = new Capitalize();
    }

    @Test
    void capitalize() {

        System.out.println(capitalize.capitalize("hello here  iam"));
    }
}