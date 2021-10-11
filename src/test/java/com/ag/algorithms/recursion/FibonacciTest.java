package com.ag.algorithms.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class FibonacciTest {

    @Test
    void calculate() {
        Assertions.assertThat(new Fibonacci().calculate(6)).isEqualTo(8);
    }

    @Test
    void calculateIteratively() {
        Assertions.assertThat(new Fibonacci().calculateIteratively(6)).isEqualTo(8);
    }
}