package com.ag.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();

    @Test
    void exec() {
        int[] array = new int[]{4,1,2,-3,6};

        assertThat(insertionSort.exec(array)).isEqualTo( new int[]{-3,1,2,4,6});
    }
}