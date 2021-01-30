import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        do {
            System.out.println("Введите первое число: ");
            Scanner scanNum1 = new Scanner(System.in);
            int num1 = scanNum1.nextInt();
            System.out.println(num1);

            System.out.println("Введите знак математической операции: ");
            Scanner scanOperation = new Scanner(System.in);
            char operation = scanOperation.nextChar();
            System.out.println(operation);

            System.out.println("Введите второе число: ");
            Scanner scanNum2 = new Scanner(System.in);
            int num2 = scanNum2.nextInt();
            System.out.println(num2);

            int result;

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
                    break;
                }
                case '%' : {
                    result = num1 % num2;
                    break;
                }
                default:
                System.out.println("Знак математической операции некорректен");
            }
        
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            System.out.println("Хотите продолжить вычисления? да / нет ");
            Scanner scanProceed = new Scanner(System.in);
            String proceed = scanProceed.nextString();
            System.out.println(proceed);

            switch(proceed) {
                case "да" : {
                    return;
                }
                case "нет" : {
                    System.out.println("Вычисления окончены");
                break;
                }
                default :
                    System.out.println("Выбранный ответ некорректен");
                    return;
                }
        } while(proceed != "нет");
    }
}