import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.calculatorOne = new Calculator();
        do {
            System.out.println("Введите первое число: ");
            Scanner scanNum1 = new Scanner(System.in);
            int setNum1() = scanNum1.nextInt();
            System.out.println(calculatorOne.getNum1());

            System.out.println("Введите знак математической операции: ");
            Scanner scanOperation = new Scanner(System.in);
            int setOperation() = scanOperation.nextChar();
            System.out.println(calculatorOne.getOperation());

            System.out.println("Введите второе число: ");
            Scanner scanNum2 = new Scanner(System.in);
            int setNum2() = scanNum2.nextInt();
            System.out.println(calculatorOne.getNum2());

            int setResult() = calculatorOne.getResult();

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