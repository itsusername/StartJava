public class GuessNumber {

    public boolean startGame(int random_number, int number, Object name) {
        if (number == random_number) {
            System.out.println("Игрок: " + name + " выиграл! Загадонное число: " + number);
            return false;
        } else {
            System.out.println("Игрок: " + name + " Вы не угадали!");
            return true;
        }
    }
}