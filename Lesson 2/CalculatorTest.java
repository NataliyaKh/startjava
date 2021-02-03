import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.calculatorOne = new Calculator();
        String proceed;

        do {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Введите первое число: ");
            int num1 = scan.nextInt();
            System.out.println(calculatorOne.getNum1());

            System.out.println("Введите знак математической операции: ");
            int operation = scan.next();
            System.out.println(calculatorOne.getOperation());

            System.out.println("Введите второе число: ");
            int num2 = scan.nextInt();
            System.out.println(calculatorOne.getNum2());

            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? да / нет ");
            String proceed = scan.next();
            System.out.println(proceed);

            public String proceed(String proceed) {
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
            }
        } while (proceed != "нет");
    }
}