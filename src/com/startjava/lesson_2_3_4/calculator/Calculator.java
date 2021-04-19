package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int result;

    public int calculate(int num1, int num2, char operation) {
        switch(operation) {
            case '+': 
                result = num1 + num2;
                break;
             case'-':
                result = num1 - num2;
                break;
             case '*':
                result = num1 * num2;
                break;
             case '/':
                result = num1 / num2;
                break;
             case '^':
                int powResult = 1;
                for(int i = 1; i <= num2; i++) {
                    powResult *= num1;
                }
                result = powResult;
                break;
             case '%':
                result = num1 % num2;
                break;
        } 
        return result;
    }
}