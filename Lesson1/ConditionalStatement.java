public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 26;
        if (age > 20) {
            System.out.println("Тебе пора замуж");
        }

        char sex = 'w';
        if (sex == 'm') {
            System.out.println("Поздравляю, ты женщина, но не увидишь это сообщение");
        }

        if (sex != 'm') {
            System.out.println("А это увидишь");
        }

        float height = 1.55f;
        if (height < 1.8) {
            System.out.println("Даже не знаю, что сказать");
        } else {
            System.out.println("Ты точно женщина?");
        }

        char firstLetterOfName = 'O';
        if (firstLetterOfName == 'M') {
            System.out.println("У меня закончилась фантазия");
        } else if (firstLetterOfName == 'I') {
            System.out.println("сообщение в else if");
        } else {
            System.out.println("сообщение в else");
        }
    }
}