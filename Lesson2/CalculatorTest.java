import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
       do {
            Calculator clclt = new Calculator();
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите знак математической операции: ");
            char operation = in.next(".").charAt(0);
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            int res = clclt.calculateData(num1, num2, operation);
            System.out.println("Результат: " + res);
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            String userAnswer = in.nextLine();
        } while (userAnswer == "yes");
    }
}