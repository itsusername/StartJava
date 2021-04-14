import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player p1;
    private Player p2;
    Random generator = new Random();
    Scanner in = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
    }

    public void start() {
        int randomNumber = generator.nextInt(100) + 1;

        do {
            int num1 = inputPlayerNum(p1.toString());
            if (checkNum(randomNumber, num1, p1.toString())) {
                break;
            }

            int num2 = inputPlayerNum(p2.toString());
            if (checkNum(randomNumber, num2, p2.toString())) {
                break;
            }
        } while (true);

        in.nextLine();
    }

    public int inputPlayerNum(String name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }

    public boolean checkNum(int randomNumber, int number, String name) {
        if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (number < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(name + ", Поздравляю! Вы выиграли");
            return true;
        }
    }
}