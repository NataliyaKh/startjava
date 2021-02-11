import java.util.Scanner;

public class CalculatorTest {
    String proceed;
    public void main(String[] args) {
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

            calculatorOne.getResult();
            
            System.out.println(num1 + " " + operation + " " + num2 + " = " + calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? да / нет ");
            String proceed = scan.next();
            calculatorOne.setProceed(proceed);
            System.out.println(proceed);
            calculatorOne.offerProceed();
        } while (proceed != "нет");
    }

    void offerProceed(String proceed) {
        switch(proceed) {
            case "да" :
                return;
            case "нет" :
                System.out.println("Вычисления окончены");
                return;
            default :
                System.out.println("Выбранный ответ некорректен");
                break;
            }
        return proceed;
    }

    public String getProceed() {
        return proceed;
    }

    void setProceed(String proceed) {
        this.proceed = proceed;
    }
}