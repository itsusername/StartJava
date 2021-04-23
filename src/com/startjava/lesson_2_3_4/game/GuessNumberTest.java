package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name1 = createPlayer(1);
        Player p1 = new Player(name1);

        String name2 = createPlayer(2);
        Player p2 = new Player(name2);

        GuessNumber game = new GuessNumber(p1, p2);

        do {
            game.start();
        } while (isNext());
    }

    private static String createPlayer(int n) {
        System.out.println("Игрок №" + n + ", введите Ваше имя: ");
        return in.nextLine();
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
