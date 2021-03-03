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
            
            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.calculate() + "\n Хотите продолжить вычисления? да / нет " );
        } while (isNext());
        System.out.println("Вычисления окончены");
    }

    public static boolean isNext() {
        Scanner scan = new Scanner(System.in);
        String answer;
        answer = scan.next();
        scan.nextLine();
        do {
            System.out.println("Выбранный ответ некорректен. Введите да / нет");
            answer = scan.next();
            scan.nextLine();
        } while (!answer.equals("да")&!answer.equals("нет"));
        if(answer.equals("нет")) {
            return false;
        } else {
            return true;
        }
    }
}