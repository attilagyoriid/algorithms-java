package com.ag.algorithms.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    @DisplayName("multiple elements sorted")
    void exec_multiple() {

        int[] array = new int[]{4,1,2,-3,6};

        assertThat(bubbleSort.exec(array)).isEqualTo( new int[]{-3,1,2,4,6});

    }
}