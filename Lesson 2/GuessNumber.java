import java.util.Scanner;

public class GuessNumber {   
    public static void attempt() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Scanner scan = new Scanner(System.in, "Cp866");
        RandomComputerNum computerNum = new RandomComputerNum();
        GuessNumber game = new GuessNumber();
        GuessNumber.compare();
        System.out.println("Угадайте число от 0 до 100!\n");
        do {
                System.out.println(playerOne.getName() + ", выберите число!");
                int guessNum = scan.nextInt();
                playerOne.setGuessNum(guessNum);
                GuessNumber.compare();
                if(compare()) {
                    System.out.println(playerTwo.getName() + ", выберите число!");
                    guessNum = scan.nextInt();
                    playerTwo.setGuessNum(guessNum);
                    GuessNumber.compare();
                }
            } while(GuessNumber.compare());
    }

    public static boolean compare() {
        if(Player.getGuessNum() > RandomComputerNum.getComputerNum()) {
            System.out.println("Ваш вариант - " + Player.getGuessNum() + "\nВведённое вами число больше того, что загадал компьютер.\n");
        } else if(Player.getGuessNum() < RandomComputerNum.getComputerNum()) {
            System.out.println("Ваш вариант - " + Player.getGuessNum() + "\nВведённое вами число меньше того, что загадал компьютер.\n");
        } else if(Player.getGuessNum() == RandomComputerNum.getComputerNum()) {
            System.out.println("Ваш вариант - " + Player.getGuessNum() + "\nВы угадали!");
        }
        return Player.getGuessNum() != RandomComputerNum.getComputerNum();
    }
}