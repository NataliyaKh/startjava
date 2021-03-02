import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        String answer = "да";

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
        } while (isNext());
    }

    public static boolean isNext() {
        System.out.println("Хотите продолжить вычисления? да / нет ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        scan.nextLine();
        boolean answerValid = Boolean.valueOf(answer.equals("да"))|Boolean.valueOf(answer.equals("нет"));
        while (answerValid == false) {
            System.out.println("Выбранный ответ некорректен. Введите да / нет");
            answer = scan.next();
            scan.nextLine();
            return answerValid;
        }
        if (answer.equals("нет")) {
                System.out.println("Вычисления окончены");
                }
            return answerValid;
        }
}