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
        int attemptPlayer1 = 0;
        int attemptPlayer2 = 0;

        do {
            int num1 = inputNum(p1.getName());

            if (attemptPlayer1 != 9) {
                p1.attempts(attemptPlayer1, num1);
                attemptPlayer1++;
            } else {
                System.out.println("У " + p1.getName() + " закончились попытки");
            }
            if (checkNums(randomNumber, num1, p1.getName(), attemptPlayer1)) {
                showAttempts(attemptPlayer1, p1);
                showAttempts(attemptPlayer2, p2);
                break;
            }

            int num2 = inputNum(p2.getName());

            if (attemptPlayer2 != 9) {
                p2.attempts(attemptPlayer2, num2);
                attemptPlayer2++;
            } else {
                System.out.println("У " + p2.getName() + " закончились попытки");
                showAttempts(attemptPlayer1, p1);
                showAttempts(attemptPlayer2, p2);
                break;
            }
            if (checkNums(randomNumber, num2, p2.getName(), attemptPlayer2)) {
                showAttempts(attemptPlayer1, p1);
                showAttempts(attemptPlayer2, p2);
                break;
            }
        } while (true);
    }

    private int inputNum(String name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }

    private boolean checkNums(int randomNumber, int number, String name, int attemptPlayer) {
        if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (number < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Игрок \"" + name + "\" угадал число " + randomNumber + " c " + attemptPlayer + " попытки");
            return true;
        }
    }

    private void showAttempts(int attemptPlayer, Player p) {
        System.out.print(p.getName() + " - ");
        for (int numbs : p.getEnteredNums(attemptPlayer)) {
            System.out.print(numbs+" ");
        }
        System.out.print(" ");
        p.clearNums(attemptPlayer);
        p.clearNums(attemptPlayer);
    }
}