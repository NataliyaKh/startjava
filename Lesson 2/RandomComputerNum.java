import java.util.Random;

public class RandomComputerNum {
    private static int computerNum;
    public static void main(String[] args) {
        Random random = new Random();
        int computerNum = random.nextInt(100);
        System.out.println(computerNum);
    }

    public static int getComputerNum() {
        return computerNum;
    }

    void setComputerNum(int computerNum) {
        this.computerNum = computerNum;
    }
}