public class Calculator {
    public static void main(String[] args) {
        int num1 = 371;
        char operation = '^';
        int num2 = 3;
        int result;

        if (operation == '+') {
            result = num1 + num2;
        } else if(operation == '+') {
            result = num1 - num2;
        } else if(operation == '*') {
            result = num1 * num2;
        } else if(operation == '/') {
            result = num1 / num2;
        } else if(operation == '^') {
            result = 1;
            for (int exponent = 1; exponent <= num2; exponent++) {
                result *= num1;
            }
        } else if(operation == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Знак математической операции некорректен");
            return;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}