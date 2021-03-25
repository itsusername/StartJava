import java.util.Scanner;

public class GuessNumber {
    Scanner in = new Scanner(System.in);

    public void calculateData() {
        int a = 0;
        int b = 100;
        int random_number1 = a + (int) (Math.random() * b);

        System.out.println("Введите Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите число: ");
        int number = in.next().charAt(0);
        Player p1 = new Player(name, number);
        p1.guessNum(random_number1);

        System.out.println("Введите Ваше имя: ");
        name = in.nextLine();
        System.out.println("Введите число: ");
        number = in.next().charAt(0);
        Player p2 = new Player(name, number);
        p2.guessNum(random_number1);

        newGame();
    }

    public void newGame() {
        System.out.print("Хотите продолжить вычисления? [yes/no]:");
        String userAnswer = in.nextLine();
        
        if (userAnswer.equals("yes")) {
            calculateData();
            //calculateData();
        } else if (userAnswer.equals("no")) {
        } else {
            while(userAnswer.equals("yes") || !userAnswer.equals("no")) {
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = in.nextLine();
            }
        }
    }
}