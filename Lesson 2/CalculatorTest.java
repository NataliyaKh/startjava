import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
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

            calculatorOne.countResult();
            
            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? да / нет ");
            String proceed = scan.next();
            calculatorOne.setProceed(proceed);
            calculatorOne.offerProceed();
        } while (proceed != "нет");
    }
}