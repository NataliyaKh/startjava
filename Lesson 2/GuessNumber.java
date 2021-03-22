import java.util.Scanner;
import java.util.Random;

public class GuessNumber {   
    public static void main(String[] args) {
        Random number = new Random();
        Scanner scan = new Scanner(System.in);
        Player playerOne = new Player();
        Player playerTwo = new Player();
        System.out.println("Угадайте число от 0 до 100!\n");
        int computerNum = number.nextInt(100);
    }

    public int getComputerNum() {
        return computerNum;
    }
    void setComputerNum(int computerNum) {
        this.computerNum = computerNum;
    }

    public boolean compare() {
        if(Player.getGuessNum() > getComputerNum()) {
            System.out.println("Ваш вариант - " + Player.getGuessNum() + "\nВведённое вами число больше того, что загадал компьютер.\n");
        } else if(Player.getGuessNum() < getComputerNum()) {
            System.out.println("Ваш вариант - " + Player.getGuessNum() + "\nВведённое вами число меньше того, что загадал компьютер.\n");
        } else if(Player.getGuessNum() == getComputerNum()) {
            System.out.println("Ваш вариант - " + Player.getGuessNum() + "\nВы угадали!");
        }
        return Player.getGuessNum() != getComputerNum();
    }

    public boolean getCompare() {
        return compare;
    }
}