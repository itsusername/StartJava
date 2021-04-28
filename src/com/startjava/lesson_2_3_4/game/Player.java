package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums  = new int[10];
    private int attemptNum;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        enteredNums[attemptNum] = num;
        this.attemptNum = attemptNum + 1;
    }

    public int getLastNum() {
        return enteredNums[attemptNum - 1];
    }

    public void setAttemptNum(int attemptNum) {
        this.attemptNum = attemptNum;
    }

    public int getAttemptNum() {
        return attemptNum;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attemptNum);
    }

    public void clearNums() {
        Arrays.fill(enteredNums, 0, attemptNum, 0);
    }
}