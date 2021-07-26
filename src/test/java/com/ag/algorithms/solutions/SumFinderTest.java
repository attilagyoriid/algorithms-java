package com.ag.algorithms.solutions;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SumFinderTest {

    @BeforeEach
    void setUp() {
    }


    @ParameterizedTest
    @MethodSource("inputListProvider")
    void findPairAddUpToExpectedValue(List<Integer> list, int sum) {
        System.out.println(list + ":" + sum);

    }


    private static Stream<Arguments> inputListProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2), 8),
                Arguments.of(Arrays.asList(1, 2), 10),
                Arguments.of(Arrays.asList(1, 2), 12),
                Arguments.of(Arrays.asList(1, 2), 15)
        );
    }
}