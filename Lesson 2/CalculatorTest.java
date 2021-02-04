import java.util.Scanner;

public class CalculatorTest {
    Calculator calculatorOne = new Calculator();
    String proceed;
    public static void main(String[] args) {
        do {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Введите первое число: ");
            int num1 = scan.nextInt();
            System.out.println(calculatorOne.setNum1());

            System.out.println("Введите знак математической операции: ");
            int operation = scan.next();
            System.out.println(calculatorOne.setOperation());

            System.out.println("Введите второе число: ");
            int num2 = scan.nextInt();
            System.out.println(calculatorOne.setNum2());

            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? да / нет ");
            String proceed = scan.next();
            System.out.println(proceed);
        } while (proceed != "нет");
    }

    void getProceed() {
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
    } 