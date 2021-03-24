public class Calculator {

    int num1;
    char operation;
    int num2;
    int result;

    public int calculateData(int num1, int num2, char operation) {
        switch(operation) {
        case '+': 
            result = num1 + num2;
            break;
         case'-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         case '^':
            int powResult = 1;
            for(int i = 1; i <= num2; i++) {
                powResult *= num1;
            }
            result = powResult;
            break;
         case '%':
            result = num1 % num2;
            break;
        } 
        return result;
    }
}