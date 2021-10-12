package com.ag.algorithms.solutions.chunkArrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ChunkArrayTest {

    @Test
    void arrangeInChunks() {
        int[] list = {1, 3, 4, 5, 6, 7, 8, 0};
        int[][] x = new ChunkArray().arrangeInChunks(list, 2);
        int[][] expected = {{1, 3}, {4, 5}, {6, 7}, {8, 0}};
        System.out.println(Arrays.deepToString(x));
        Assertions.assertThat(expected).isEqualTo(x);
    }

}
