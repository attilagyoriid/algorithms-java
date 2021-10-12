package com.ag.algorithms.solutions.chunkArrays;

public class ChunkArray {

    public int[][] arrangeInChunks(int[] list, int chunkSize) {
        int[][] chunkArray = new int[(int) Math.floor(list.length / chunkSize)][chunkSize];


        int chunkIndex = -1;
        int index = 0;
        for (int i = 0; i < list.length -1 ; i++) {
            if (index == 0 || ((index) % chunkSize) == 0 ) {
                index = 0;
                chunkIndex++;
                chunkArray[chunkIndex][index] = list[i];

                index++;
            } else {
                chunkArray[chunkIndex][index] = list[i];
                index++;
            }



        }

        return chunkArray;


    }
}
