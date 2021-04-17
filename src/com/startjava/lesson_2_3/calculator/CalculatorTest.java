package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        do {
            int num1 = inputNum();
            char operation = inputOperation();
            int num2 = inputNum();
            in.nextLine();
            int res = calc.calculate(num1, num2, operation);
            System.out.println("Результат равен: " + res);
        } while (isNext());
    }

    public static int inputNum() {
        System.out.print("Введите число: ");
        return in.nextInt();
    }

    public static char inputOperation() {
        System.out.print("Введите знак математической операции: ");
        return in.next().charAt(0);
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