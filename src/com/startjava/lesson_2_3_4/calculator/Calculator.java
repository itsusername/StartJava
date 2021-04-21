package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int result;

    public int calculate(int num1, String operation, int num2) {
        switch(operation) {
            case "+":
                result = num1 + num2;
                break;
             case"-":
                result = num1 - num2;
                break;
             case "*":
                result = num1 * num2;
                break;
             case "/":
                result = num1 / num2;
                break;
             case "^":
                result = (int) Math.pow(num1, num2);
                break;
             case "%":
                result = num1 % num2;
                break;
        } 
        return result;
    }
}