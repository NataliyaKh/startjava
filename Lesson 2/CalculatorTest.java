import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
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
    }

    public static boolean isNext() {
        System.out.println("Хотите продолжить вычисления? да / нет ");
        String answer;
        Scanner scan = new Scanner(System.in);
        answer = scan.next();
        scan.nextLine();
        if(answer.equals("нет")) {
            System.out.println("Вычисления окончены");
            return false;
        } else {
                while (!answer.equals("да")) {
                    System.out.println("Выбранный ответ некорректен. Введите да / нет");
                    String answer;
                    answer = scan.next();
                    scan.nextLine();
                    return true;
                    }
                return true;
                }
    }
}