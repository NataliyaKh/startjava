import java.util.Scanner;

public class Calculator {
    private int num1;
    private char operation;
    private int num2;
    private int result;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return getNum2;
    }

    public void getOperation() {
        return operation;
    }

    public int getResult() {
        return result;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setOperation (char operation) {
        Scanner scanOperation = new Scanner(System.in);
        System.out.println("Введите знак математической операции: ");
        char operation = scanOperation.nextChar();
        switch(operation) {
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
        char setOperation() = scanOperation.nextChar();
        System.out.println(calculatorOne.getOperation());
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
        this.operation = operation;
    }

    void setResult(int result) {
        this.result = result;
    }
    
}