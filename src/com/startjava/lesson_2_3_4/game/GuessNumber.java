package com.startjava.lesson_2_3_4.game;

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
        System.out.println("Welcome! У вас по 10 попыток, чтобы отгадать число");
        p1.setAttemptNumber(0);
        p2.setAttemptNumber(0);

        do {
            if (p1.getAttemptNumber() < 10) {
                p1.setNumbs(inputNum(p1.getName()));
                p1.setAttemptNumber(p1.getAttemptNumber()+1);
            } else {
                System.out.println("У " + p1.getName() + " закончились попытки");
            }

            if (checkNums(randomNumber, p1)) {
                break;
            }

            if (p2.getAttemptNumber() < 10) {
                p2.setNumbs(inputNum(p2.getName()));
                p2.setAttemptNumber(p2.getAttemptNumber()+1);
            } else {
                System.out.println("У " + p2.getName() + " закончились попытки");
                break;
            }

            if (checkNums(randomNumber, p2)) {
                break;
            }
        } while (true);
        showAttempts(p1);
        showAttempts(p2);
        p1.clearNums();
        p2.clearNums();
    }

    private int inputNum(String name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }

    private boolean checkNums(int randomNumber, Player p) {
        if (p.getNumbs() == randomNumber) {
            System.out.println("Игрок \"" + p.getName() + "\" угадал число " + randomNumber + " c " + p.getAttemptNumber() + " попытки");
            return true;
        }

        if (p.getNumbs() > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void showAttempts(Player p) {
        System.out.print(p.getName() + " - ");
        for (int num : p.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
}
