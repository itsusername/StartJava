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
        p1.attemptPlayer = 0;
        p2.attemptPlayer = 0;

        do {
            if (p1.attemptPlayer < 10) {
                p1.setNumbs(inputNum(p1.getName()));
                p1.getLastAttempt(p1.attemptPlayer);
                p1.attemptPlayer++;
            } else {
                System.out.println("У " + p1.getName() + " закончились попытки" + p1.attemptPlayer);
            }

            if (checkNums(randomNumber, p1)) {
                break;
            }

            if (p2.attemptPlayer < 10) {
                p2.setNumbs(inputNum(p2.getName()));
                p2.getLastAttempt(p2.attemptPlayer);
                p2.attemptPlayer++;
            } else {
                System.out.println("У " + p2.getName() + " закончились попытки"+ p2.attemptPlayer);
                break;
            }

            if (checkNums(randomNumber, p2)) {
                break;
            }
        } while (true);
        showAttempts(p1.attemptPlayer, p1);
        showAttempts(p2.attemptPlayer, p2);
        p1.clearNums(p1.attemptPlayer);
        p2.clearNums(p2.attemptPlayer);
    }

    private int inputNum(String name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }

    private boolean checkNums(int randomNumber, Player p) {
        if (p.getNumbs() == randomNumber) {
            System.out.println("Игрок \"" + p.getName() + "\" угадал число " + randomNumber + " c " + p.attemptPlayer + " попытки");
            return true;
        } else {
            if (p.getNumbs() > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            return false;
        }
    }

    private void showAttempts(int attemptPlayer, Player p) {
        System.out.print(p.getName() + " - ");
        for (int numbs : p.getEnteredNums(attemptPlayer)) {
            System.out.print(numbs+" ");
        }
        System.out.print("\n");
    }
}
