import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        String proceed;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите первое число: ");
            int num1 = scan.nextInt();
            calculatorOne.setNum1(num1);

            System.out.println("Введите знак математической операции: ");
            char operation = scan.next().charAt(0);
            calculatorOne.setOperation(operation);

            System.out.println("Введите второе число: ");
            int num2 = scan.nextInt();
            calculatorOne.setNum2(num2);
            
            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.calculate());
            System.out.println("Хотите продолжить вычисления? да / нет ");
            proceed = scan.next();
            calculatorOne.setProceed(proceed);
            calculatorOne.isNext();
        } while (proceed != "нет");
    }
}