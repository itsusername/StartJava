public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        char operation = '+';
        int num2 = 5;
        int result = 0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '^') {
            int powResult = 1;
            for(int i = 1; i <= num2; i++) {
                powResult *= num1;
            }
            result = powResult;
        } else if (operation == '%') {
            result = num1 % num2;
        } 
        
        System.out.println("Результат: " + result);
    }
}