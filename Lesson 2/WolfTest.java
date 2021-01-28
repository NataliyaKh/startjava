public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex('M');
        wolfOne.setName("White Fang");
        wolfOne.setWeight(56);
        wolfOne.setAge(9);
        wolfOne.setColour("grey");
        
        System.out.println("sex = " + wolfOne.getSex());
        System.out.println("name = " + wolfOne.getName());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("colour = " + wolfOne.getColour());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}