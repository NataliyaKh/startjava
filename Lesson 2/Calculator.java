import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private char operation;
    public int result;
    public String proceed;
    public boolean next = true;

    public int getNum1() {
        return num1;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOperation() {
        return operation;
    }

    void setOperation (char operation) {
        this.operation = operation;
    }

        public String getProceed() {
        return proceed;
    }

    void setProceed(String proceed) {
        this.proceed = proceed;
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
                result = 1;
                for (int exponent = 1; exponent <= num2; exponent++) {
                    return result *= num1;
                }
            case '%' : 
                return num1 % num2;
            default : 
                System.out.println("Знак математической операции некорректен");
                break;
            }
        return 0;
    }

    public void isNext(String proceed) {
        boolean proceedValid; 
        do {
            Scanner scan = new Scanner(System.in);
            proceed = scan.next();
            proceedValid = (proceed == "да")||(proceed == "нет");
            System.out.println("Выбранный ответ некорректен. Введите да / нет");
            if(proceed == "да") {
                return;
            } else {
                System.out.println("Вычисления окончены");
                break;
                }
            } while (proceedValid = false);
    }
}