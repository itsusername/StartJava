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
        int randomNum = generator.nextInt(100) + 1;
        System.out.println("Welcome! У вас по 10 попыток, чтобы отгадать число");
        p1.setAttemptNum(0);
        p2.setAttemptNum(0);

        do {
            if (checkGameProcess(randomNum, p1)) {
                break;
            }

            if (checkGameProcess(randomNum, p2)) {
                break;
            }

            if (p2.getAttemptNum() == 10) {
                break;
            }
        } while (true);
        showAttempts(p1);
        showAttempts(p2);
        p1.clearNums();
        p2.clearNums();
    }

    private boolean checkGameProcess(int randomNum, Player p) {
        if (p.getAttemptNum() < 10) {
            p.setNum(inputNum(p.getName()));
            p.setAttemptNum(p.getAttemptNum() + 1);
            if (checkNums(randomNum, p)) {
                return true;
            }
        }
        if(p.getAttemptNum() == 10) {
            System.out.println("У " + p.getName() + " закончились попытки");
        }
        return false;
    }

    private int inputNum(String name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }

    private boolean checkNums(int randomNum, Player p) {
        if (p.getLastNum() == randomNum) {
            System.out.println("Игрок \"" + p.getName() + "\" угадал число " + randomNum + " c " + p.getAttemptNum() + " попытки");
            return true;
        }

        if (p.getLastNum() > randomNum) {
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