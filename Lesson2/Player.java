public class Player {
    String name;
    int number;

    Player() {
    }

    Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void guessNum(int random_number1) {

        if (number == random_number1) {
            System.out.println("Игрок: " + name + " выиграл! Загадонное число: " + number);
        } else {
            System.out.println("Игрок: " + name + " Вы не угадали! Загадонное число: " + number + "\n");
        }
    }
}