package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        do {
            String[] operation = inputMathOperation().split(" ");
            int res = calc.calculate(Integer.parseInt(operation[0]), operation[1], Integer.parseInt(operation[2]));
            System.out.println("Результат равен: " + res);
        } while (isNext());
    }

    public static String inputMathOperation() {
        System.out.print("Введите математическое выражение: ");
        return in.nextLine();
    }

    public static boolean isNext() {
        System.out.print("Хотите продолжить вычисления? [yes/no]:");
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