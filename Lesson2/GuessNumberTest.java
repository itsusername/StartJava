import java.util.Scanner;

public class GuessNumberTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String playerName1 = inputPlayerName(1);
        Player p1 = new Player(playerName1);

        String playerName2 = inputPlayerName(2);
        Player p2 = new Player(playerName2);

        GuessNumber game = new GuessNumber(p1, p2);
        boolean gameResult;

        do {
            gameResult = game.start();
        } while (isNext() & gameResult);
    }

    public static String inputPlayerName(int n) {
            System.out.println("Игрок №" + n + ", введите Ваше имя: ");
            return in.nextLine();
        }

    public static boolean isNext() {
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
}
