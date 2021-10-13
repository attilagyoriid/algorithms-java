package com.ag.algorithms.solutions.strings;

public class Stair {

    public void create(int level) {
        String stairBlock = "#";
        StringBuilder currentLevel = new StringBuilder();
        int index = 0;
        for (int i = 1; i <= level; i++) {

            while (i>index) {
                currentLevel.append(stairBlock);
                index++;
            }
            while (index<=level) {
                currentLevel.append(" ");
                index++;
            }
            System.out.println(currentLevel.toString());
            index=0;
            currentLevel = new StringBuilder();

        }


    }
}
