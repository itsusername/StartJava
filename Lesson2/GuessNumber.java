import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    Player p1;
    Player p2;

    GuessNumber(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
    }

    Random generator = new Random();

    public boolean start() {
        boolean res;
        int randomNumber = generator.nextInt(100) + 1;

        do {
            int num = inputPlayerNum(p1);
            res = checkNum(randomNumber, num, p1);

            if (!res) {
                num = inputPlayerNum(p2);
                res = checkNum(randomNumber, num, p2);
            }
        } while (!res);

        in.nextLine();

        if (res) {
            return true;
        } else { 
            return false;
        }
    }

    public boolean checkNum(int randomNumber, int number, Player player) {
        if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (number < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(player + ", Поздравляю! Вы выиграли");
            return true;
        }
    }

    Scanner in = new Scanner(System.in);

    public int inputPlayerNum(Object name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }
}