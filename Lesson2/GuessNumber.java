import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    Random generator = new Random();
    GuessNumberTest newGame = new GuessNumberTest();

    public void startGame(String p1, String p2) {
        boolean res;
        do {
            int random_number = generator.nextInt(100) + 1;
            do {
                int playerNum1 = inputPlayerNum(p1);
                res = checkNum(random_number, playerNum1, p1);
                if (res != true) {
                    int playerNum2 = inputPlayerNum(p2);
                    res = checkNum(random_number, playerNum2, p2);
                }
                in.nextLine();
            } while (!res);
        } while (newGame.isNext());
    }

    public boolean checkNum(int random_number, int number, Object name) {
        if (number > random_number) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (number < random_number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(name + ", Поздравляю! Вы выиграли");
            return true;
        }
    }

    Scanner in = new Scanner(System.in);

    public String inputPlayerName(int n) {
        System.out.println("Игрок №" + n + ", введите Ваше имя: ");
        return in.nextLine();
    }

    public int inputPlayerNum(Object name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
    }
}