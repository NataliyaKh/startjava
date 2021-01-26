public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        
        wolfOne.sex = 'M';
        wolfOne.name = "White Fang";
        wolfOne.weight = 56;
        wolfOne.age = 3;
        wolfOne.colour = "grey";

        System.out.println("sex = " + wolfOne.sex);
        System.out.println("name = " + wolfOne.name);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("colour = " + wolfOne.colour);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}