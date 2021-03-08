import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
            String answer = "да";
            
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
        } while (isNext());
        scan.close();
        System.out.println("Вычисления окончены");
    }

    private static boolean isNext() {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("Хотите продолжить вычисления? да / нет ");
        String answer = scan.next();
        scan.nextLine();
        while (!answer.equals("да") && !answer.equals("нет")) {
           System.out.println("Выбранный ответ некорректен. Введите да / нет");
           answer = scan.next();
           scan.nextLine();
        }
        return answer.equals("да");
    }
}