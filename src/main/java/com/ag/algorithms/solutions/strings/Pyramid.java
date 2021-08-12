package com.ag.algorithms.solutions.strings;

import java.util.ArrayList;

public class Pyramid {

    public ArrayList<String> draw(Integer height) {
        int rows = height;
        int columns = (height * 2) - 1;
        int sideSpace = height-1;
        ArrayList<String> result = new ArrayList<>();

        String step = "";
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                if (((c <= sideSpace) || (c > (columns - sideSpace)))) {
                    step += " ";
                } else {
                    step += "#";
                }
            }
            System.out.println(step);
            result.add(step);
            step = "";
            sideSpace--;

        }
        return result;
    }
}
