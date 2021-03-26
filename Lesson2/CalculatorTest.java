import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator clclt = new Calculator();
        //int res = clclt.calculate(num1, num2, operation);
        int res = clclt.calculate(clclt.getNum1(), clclt.getNum2(), clclt.getOperation());
        //System.out.println("num1: " + clclt.getNum1());
        //System.out.println("num2: " + clclt.getNum2());
        //System.out.println("operation: " + clclt.getOperation());
        System.out.println("Результат равен: " + res);
        //System.out.println("Результат равен: " + res);
        String userAnswer;
        
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = in.nextLine();
            } while (!userAnswer.equals("yes") || !userAnswer.equals("no"));

        if (userAnswer.equals("yes")) {
            inputOperands();
            System.out.println("Результат равен: " + res);
        }
    }

    public static void inputOperands() {
        CalculatorTest val = new CalculatorTest();
        Calculator values = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите знак математической операции: ");
        char operation = in.next(".").charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        values.setNum1(num1);
        values.setOperation(operation);
        values.setNum2(num2);
        //System.out.println("num1: " + num1);
        //System.out.println("num2: " + num2);
        //System.out.println("operation: " + operation);
        //int res = clclt.calculateData(num1, num2, operation);
        //return values;
    }
}