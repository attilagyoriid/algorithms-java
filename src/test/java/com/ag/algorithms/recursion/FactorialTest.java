package com.ag.algorithms.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void calculate() {

        Assertions.assertThat(new Factorial().calculate(5)).isEqualTo(120);


    }
}