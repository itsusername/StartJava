import java.util.Scanner;

public class GuessNumberTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumber num = new GuessNumber();

        String player1 = num.inputPlayerName(1);
        Player p1 = new Player(player1);

        String player2 = num.inputPlayerName(2);
        Player p2 = new Player(player2);

        num.startGame(p1.getName(), p2.getName());
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
