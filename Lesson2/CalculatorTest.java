import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = calculateData();
        System.out.println("Результат равен: " + res);

        System.out.print("Хотите продолжить вычисления? [yes/no]:");
        String userAnswer = in.nextLine();

        if (userAnswer.equals("yes")) {
            res = calculateData();
            System.out.println("Результат равен: " + res);
        } else if (userAnswer.equals("no")) {
        } else {
            while(userAnswer.equals("yes") || !userAnswer.equals("no")) {
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = in.nextLine();
            }
        }

        int calculateData() {
            Scanner in = new Scanner(System.in);
            Calculator clclt = new Calculator();
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите знак математической операции: ");
            char operation = in.next(".").charAt(0);
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            int res = clclt.calculateData(num1, num2, operation);
            return  res;
        }
    }
}