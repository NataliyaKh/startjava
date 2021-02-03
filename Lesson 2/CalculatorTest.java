import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.calculatorOne = new Calculator();
        do {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Введите первое число: ");
            int setNum1() = scan.nextInt();
            System.out.println(calculatorOne.getNum1());

            System.out.println("Введите знак математической операции: ");
            int setOperation() = scan.next();
            System.out.println(calculatorOne.getOperation());

            System.out.println("Введите второе число: ");
            int setNum2() = scan.nextInt();
            System.out.println(calculatorOne.getNum2());

            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? да / нет ");
            String proceed = scan.next();
            System.out.println(proceed);

            public String getProceed() {
                switch(String proceed)
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