public class MyFirstGame {   
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100!\n");
        int num1 = 74;
        int num2 = 82;
        do {
            if(num2 > num1) {
            System.out.println("Ваш вариант - " + num2 + "\nВведённое вами число больше того, что загадал компьютер.\n");
            num2-=1;
            } else if(num2 < num1) {
            System.out.println("Ваш вариант - " + num2 + "\nВведённое вами число меньше того, что загадал компьютер.\n");
            num2++;
            }
        } while(num2 != num1);
        System.out.println("Ваш вариант - " + num2 + "\nВы угадали!");
    }
}