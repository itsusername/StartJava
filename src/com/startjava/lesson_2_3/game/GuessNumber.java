package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player p1;
    private Player p2;
    Random generator = new Random();
    Scanner in = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
    }

    public void start() {
        int randomNumber = generator.nextInt(100) + 1;

        do {
            int num1 = inputPlayerNum(p1.getName());
            if (checkNums(randomNumber, num1, p1.getName())) {
                break;
            }

            int num2 = inputPlayerNum(p2.getName());
            if (checkNums(randomNumber, num2, p2.getName())) {
                break;
            }
        } while (true);
    }

    private int inputPlayerNum(String name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }

    private boolean checkNums(int randomNumber, int number, String name) {
        if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (number < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(name + ", Поздравляю! Вы выиграли");
            return true;
        }
    }
}