import java.util.Scanner;

public class Calculator {
    private int num1;
    
    public int getNum1() {
        return num1;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    private int num2;
    
    public int getNum2() {
        return getNum2;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    private char operation;
    
    public void getOperation() {
        return operation;
    }

    void setOperation (char operation) {
        this.operation = operation;
    }

    private int result;
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
        }

    public int getResult() {
        return result;
    }
    
    void setResult(int result) {
        this.result = result;
    }
    
}