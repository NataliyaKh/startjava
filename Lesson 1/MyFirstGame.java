public class MyFirstGame {   
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100!\n");
        int numComputer = 74;
        int numGuess = 82;
        do {
            if(numGuess > numComputer) {
                System.out.println("Ваш вариант - " + numGuess + "\nВведённое вами число больше того, что загадал компьютер.\n");
                numGuess--;
            } else if(numGuess < numComputer) {
                System.out.println("Ваш вариант - " + numGuess + "\nВведённое вами число меньше того, что загадал компьютер.\n");
                numGuess++;
            }
        } while(numGuess != numComputer);
        System.out.println("Ваш вариант - " + numGuess + "\nВы угадали!");
    }
}