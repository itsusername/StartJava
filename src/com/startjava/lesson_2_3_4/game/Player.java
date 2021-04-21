package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] arrAttempt = new int[10];

    public void ArrAttempt(int i, int num) {
        arrAttempt[i] = num;
    }

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }

    public int[] getArraysCopy(int i) {
        int[] arrAttemptCopy = Arrays.copyOf(arrAttempt, i);
        return arrAttemptCopy;
    }

    public void fillArray(int i) {
        Arrays.fill(arrAttempt, 0, i, 0);
    }
}