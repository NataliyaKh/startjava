public class MyFirstGame {   
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100!\n");
        int computerNum = 74;
        int guessNum = 82;
        do {
            if(guessNum > computerNum) {
                System.out.println("Ваш вариант - " + guessNum + "\nВведённое вами число больше того, что загадал компьютер.\n");
                guessNum--;
            } else if(guessNum < computerNum) {
                System.out.println("Ваш вариант - " + guessNum + "\nВведённое вами число меньше того, что загадал компьютер.\n");
                guessNum++;
            }
        } while(guessNum != computerNum);
        System.out.println("Ваш вариант - " + guessNum + "\nВы угадали!");
    }
}