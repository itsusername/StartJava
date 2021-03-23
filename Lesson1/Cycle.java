public class Cycle {

    public static void main(String[] args) {
        for (short i = 0; i <= 20; i++) {
            System.out.println(i);
        }       

        short counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }

        int num = 10, result = 0;
        do {
            if (num % 2 != 0) {
                result += num;
            }
            num++;
        } while (num <= 20);
        System.out.println(result);
    }
}