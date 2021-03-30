import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Boolean isAnswer;

        do {
            int num1 = getNum();
            char operation = getOperand();
            int num2 = getNum();

            int res = calc.calculate(num1, num2, operation);
            System.out.println("Результат равен: " + res);

            isAnswer = isNext();
        } while (isAnswer);
    }

    public static Boolean isNext() {
        Scanner in = new Scanner(System.in);
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

    public static int getNum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        return num;
    }

    public static char getOperand() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        char operation = in.next(".").charAt(0);
        return operation;
    }

}