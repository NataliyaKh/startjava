public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public int calculate() {
        switch(operation) {
            case '+' : 
                return num1 + num2;
            case '-' : 
                return num1 - num2;
            case '*' : 
                return num1 * num2;
            case '/' : 
                return num1 / num2;
            case '^' : 
                int result = 1;
                for (int exponent = 1; exponent <= num2; exponent++) {
                    result *= num1;
                }
                return result;
            case '%' : 
                return num1 % num2;
            default : 
                System.out.println("Знак математической операции некорректен");
                break;
            }
        return 0;
    }
}