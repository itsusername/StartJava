package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] attempts = new int[10];

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEnteredNums(int i) {
        return Arrays.copyOf(attempts, i);
    }

    public void attempts(int i, int num) {
        attempts[i] = num;
    }

    public void clearNums(int i) {
        Arrays.fill(attempts, 0, i, 0);
    }
}