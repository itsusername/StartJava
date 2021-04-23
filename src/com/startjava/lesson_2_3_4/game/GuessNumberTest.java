package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Player p1 = createPlayer(1);
        Player p2 = createPlayer(2);

        GuessNumber game = new GuessNumber(p1, p2);

        do {
            game.start();
        } while (isNext());
    }

    private static Player createPlayer(int n) {
        System.out.println("Игрок №" + n + ", введите Ваше имя: ");
        return new Player(in.nextLine());
    }

    private static boolean isNext() {
        System.out.print("\nХотите продолжить вычисления? [yes/no]:");
        String userAnswer = in.nextLine();

        if (userAnswer.equals("yes")) {
            return true;
        } else if (userAnswer.equals("no")) {
            return false;
        } else {
            return isNext(); 
        }
    }
}
