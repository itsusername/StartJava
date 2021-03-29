import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator act = new Calculator();
        String getAnswer;

        do {
            int num1 = act.getNum();
            char operation = act.getOperand();
            int num2 = act.getNum();

            int res = act.calculate(num1, num2, operation);
            System.out.println("Результат равен: " + res);

            getAnswer = caclContinue();
        } while (getAnswer.equals("yes"));
    }

    public static String caclContinue() {
        Scanner in = new Scanner(System.in);

        System.out.print("Хотите продолжить вычисления? [yes/no]:");
        String userAnswer = in.nextLine();
        System.out.println("Результат userAnswer: " + userAnswer);
        
        if (!userAnswer.equals("yes") | !userAnswer.equals("no")) {
            userAnswer = caclContinue();
        }
        return userAnswer;
    }
}