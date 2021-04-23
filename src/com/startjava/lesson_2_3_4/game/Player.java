package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums  = new int[10];
    private int attemptNumber;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumbs(int nums) {
        enteredNums[attemptNumber] = nums;
    }

    public int getNumbs() {
        return enteredNums[attemptNumber-1];
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attemptNumber);
    }

    public void clearNums() {
        Arrays.fill(enteredNums, 0, attemptNumber, 0);
    }
}