import java.util.Scanner;

public class CalculatorTest {
    String proceed;
    Calculator calculatorOne = new Calculator();

    public int getNum1() {
        return calculatorOne.num1;
    }
    
    public int getNum2() {
        return calculatorOne.num2;
    }
    
    public char getOperation() {
        return calculatorOne.operation;
    }
    
    public void main(String[] args) {
        do {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Введите первое число: ");
            int calculatorOne.setNum1() = scan.nextInt();
            System.out.println(calculatorOne.getNum1());

            System.out.println("Введите знак математической операции: ");
            char calculatorOne.setOperation() = scan.next().charAt(0);
            System.out.println(calculatorOne.operation());

            System.out.println("Введите второе число: ");
            int calculatorOne.setNum2() = scan.nextInt();
            System.out.println(calculatorOne.getNum2());

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
        return;
        }
    } 