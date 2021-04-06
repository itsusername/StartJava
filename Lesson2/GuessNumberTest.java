import java.util.Scanner;

public class GuessNumberTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String player1 = inputPlayerName(1);
        Player p1 = new Player(player1);

        String player2 = inputPlayerName(2);
        Player p2 = new Player(player2);
        GuessNumber num = new GuessNumber();

        do {
            int random_number = 0 + (int) (Math.random() * 100);
            //System.out.printlnyes(random_number); Для проверки корректной работы. При угадывании
            int playerNum1 = inputPlayerNum(p1.toString());
            boolean res = num.startGame(random_number, playerNum1, p1.toString());
            if(res) {
                int playerNum2 = inputPlayerNum(p2.toString());
                num.startGame(random_number, playerNum2, p2.toString());
            }
            
            in.nextLine();
        } while (isNext());
    }

    public static String inputPlayerName(int n) {
        System.out.println("Игрок №" + n + ", введите Ваше имя: ");
        return in.nextLine();
    }

    public static int inputPlayerNum(Object name) {
        System.out.println(name + ", введите число: ");
        return in.nextInt();
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
//отвечает за создание объектов, их 
//инициализацию и запуск игры. Содержит метод main