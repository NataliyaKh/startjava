import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Cp866");
        Player playerOne = new Player();
        System.out.println("Введите имя первого игрока: ");
        String name = scan.next();
        scan.nextLine();
        playerOne.setName(name);

        Player playerTwo = new Player();
        System.out.println("Введите имя второго игрока: ");
        String name = scan.next();
        scan.nextLine();
        playerTwo.setName(name);

        do {

            do {
                System.out.println(playerOne.getName() + ", выберите число!");
                int guessNum1 = scan.nextInt();
                playerOne.setGuessNum(guessNum1);
                playerOne.getCompare();
                if(compare()) {
                    System.out.println(playerTwo.getName() + ", выберите число!");
                    int guessNum2 = scan.nextInt();
                    playerTwo.setGuessNum(guessNum2);
                    playerTwo.getCompare();
                }
            } while(getCompare());
            
        } while (isNext());
        scan.close();
        System.out.println("Игра завершена");
        }

    private static boolean isNext() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите продолжить игру? [yes / no]: ");
        String answer = scan.next();
        scan.nextLine();
        while (!answer.equals("yes") && !answer.equals("no")) {
           System.out.println("Выбранный ответ некорректен. Введите [yes / no]");
           answer = scan.next();
           scan.nextLine();
        }
        return answer.equals("yes");
    }



}