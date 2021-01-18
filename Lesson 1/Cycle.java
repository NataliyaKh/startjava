public class Cycle {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 20; i++) {
            result = i;
            System.out.println (result);
         }
        
        int i1 = 6;
        while (i1 >= -6) {
           System.out.print(i1 + " ");
           i1-=2;
        }
        
        int i2 = 10;
        int sum = 0;
        do {
            sum = sum + i2;
            if(i2 % 2 != 0) {
                sum=sum+i2;
                i2++;
                }
        } while(i2 <= 20);
        System.out.println("Результат сложения " + sum);
    }
}
