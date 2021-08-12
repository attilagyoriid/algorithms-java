package com.ag.algorithms.solutions.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


class PyramidTest {

    private static Pyramid pyramid;

    @BeforeAll
    static void setUp() {
        pyramid = new Pyramid();
    }

    @Test
    void draw() {
        assertThat(pyramid.draw(4)).isEqualTo(Arrays.asList("   #   ","  ###  "," ##### ","#######"));
    }
}