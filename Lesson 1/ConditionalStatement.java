public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 21;
        if(age > 20) {
            System.out.println("Возраст больше 20");
        }

        char sex = 'F';
        if(sex == 'M') {
            System.out.println("Мужчина");
        }
        if(sex != 'M') {
            System.out.println("Женщина");
        }
        
        float height = 1.75f;
        if(height < 1.80) {
            System.out.println("Средний рост");
      } else {
                System.out.println("Высокиий рост");
             }
        
        char firstLetterName = 'A';
        if(firstLetterName == 'M') {
            System.out.println("Имя на M");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя на I");
            } else {
                System.out.println("Имя не на M и не на I");
            }
    }
}
