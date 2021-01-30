public class Calculator {
    private int num1 = 371;
    private char operation = '^';
    private int num2 = 3;
    private int result;

    public int getNum1() {
        return num1;
    }
    public char getOperation() {
        return operation;
    }
    public int getNum2() {
        return getNum2;
    }
    public int getResult() {
        return result;
    }
    void setNum1(int num1) {
            this.num1 = num1;
    }
    void setOperation(char operation) {
        this.operation = operation;
    }
    void setNum2(int num2) {
        this.num2 = num2;
    }
    void setResult(int result) {
        this.result = result;
    }
    
    public void switch(operation) {
        case '+' : 
            result = num1 + num2;
            break;
        case '-' : 
            result = num1 - num2;
            break;
        case '*' : 
            result = num1 * num2;
            break;
        case '/' : 
            result = num1 / num2;
            break;
        case '^' : 
            result = 1;
            for (int exponent = 1; exponent <= num2; exponent++) {
                result *= num1;
            }
            break;
        case '%' : 
            result = num1 % num2;
            break;
        default : 
            System.out.println("Знак математической операции некорректен");
            return;
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}