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
            int num1 = inputPlayerNum(p1.getName());

            if (attemptPlayer1 != 9) {
                p1.ArrAttempt(attemptPlayer1, num1);
                attemptPlayer1++;
            } else {
                System.out.println("У " + p1.getName() + " закончились попытки");
            }
            if (checkNums(randomNumber, num1, p1.getName(), attemptPlayer1)) {
                endOfGame(attemptPlayer1, attemptPlayer2);
                break;
            }

            int num2 = inputPlayerNum(p2.getName());

            if (attemptPlayer2 != 9) {
                p2.ArrAttempt(attemptPlayer2, num2);
                attemptPlayer2++;
            } else {
                System.out.println("У " + p2.getName() + " закончились попытки");
                endOfGame(attemptPlayer1, attemptPlayer2);
                break;
            }
            if (checkNums(randomNumber, num2, p2.getName(), attemptPlayer2)) {
                endOfGame(attemptPlayer1, attemptPlayer2);
                break;
            }
        } while (true);
    }

    private int inputPlayerNum(String name) {
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

    private void endOfGame(int attemptPlayer1, int attemptPlayer2) {
        System.out.print(p1.getName() + " - ");
        for (int numbs1 : p1.getArraysCopy(attemptPlayer1)) {
            System.out.print(numbs1+" ");
        }
        System.out.print("\n" + p2.getName() + " - ");
        for (int numbs2 : p2.getArraysCopy(attemptPlayer2)) {
            System.out.print(numbs2+" ");
        }
        p1.fillArray(attemptPlayer1);
        p2.fillArray(attemptPlayer2);
    }
}