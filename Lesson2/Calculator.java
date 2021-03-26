public class Calculator {

    private int num1;
    private char operation;
    private int num2;
    private int result;

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setOperation(char operation){
        this.operation = operation;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum1(){
        return num1;
    }

    public char getOperation(){
        return operation;
    }

    public int getNum2(){
        return num2;
    }

    public int calculate(int num1, int num2, char operation) {

//System.out.println("num1: " + num1);
//System.out.println("num2: " + num2);
//System.out.println("operation: " + operation);

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