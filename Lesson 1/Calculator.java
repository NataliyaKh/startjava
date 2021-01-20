public class Calculator {
    public static void main(String[] args){
        int num1 = 371;
        char operation = '^';
        int num2 = 3;
        if (operation == '+') {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if(operation == '+') {
            int diff = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + diff);
        } else if(operation == '*') {
            int product = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + product);
        } else if(operation == '/') {
            int fraction = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + fraction);
        } else if(operation == '^') {
            int power = 1;
            int exponent = 1;
            do {
            power = power * num1;
            exponent++;
            } while (exponent <= num2); 
            System.out.println(num1 + " ^ " + num2 + " = " + power);
        } else if(operation == '%') {
            int remainder = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + remainder);
        }
    }
}