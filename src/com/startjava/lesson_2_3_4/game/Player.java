package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int nums;
    private int[] attempts = new int[10];
    public int attemptPlayer;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumbs() {
        return nums;
    }

    public void setNumbs(int num) {
        this.nums = num;
    }

    public int[] getEnteredNums(int i) {
        return Arrays.copyOf(attempts, i);
    }

    public void getLastAttempt(int i) {
        attempts[i] = nums;
    }

    public void clearNums(int i) {
        Arrays.fill(attempts, 0, i, 0);
    }
}