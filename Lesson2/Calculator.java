import java.util.Scanner;

public class Calculator {

    private int result;
    Scanner in = new Scanner(System.in);

    public int getNum() {
        System.out.print("Введите число: ");
        int num = in.nextInt();
        return num;
    }

    public char getOperand() {
        System.out.print("Введите знак математической операции: ");
        char operation = in.next(".").charAt(0);
        return operation;
    }

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