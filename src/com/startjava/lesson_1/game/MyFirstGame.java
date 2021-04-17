package com.startjava.lesson_1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int playerNumber = 40;
        int guessNumber = 56;

        while (playerNumber > 0 && playerNumber <= 100) {
            if (playerNumber > guessNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер" + playerNumber);
                playerNumber--;
            } else if (playerNumber < guessNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер" + playerNumber);
                playerNumber++;
            } else if (playerNumber == guessNumber) {
                System.out.println("Вы угадали! Это число " + playerNumber);
                break;
            }
        }
    }
}