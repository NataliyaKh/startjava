public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 8);
        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);
        System.out.println("Jaeger One: ");
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("mark = " + jaegerOne.getMark());
        System.out.println("origin = " + jaegerOne.getOrigin());
        System.out.println("height = " + jaegerOne.getHeight());
        System.out.println("weight = " + jaegerOne.getWeight());
        System.out.println("speed = " + jaegerOne.getSpeed());
        System.out.println("strength = " + jaegerOne.getStrength());
        System.out.println("armor = " + jaegerOne.getArmor());
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();
        System.out.println("\nJaeger Two: ");
        System.out.println("modelName = " + jaegerTwo.getModelName());
        System.out.println("mark = " + jaegerTwo.getMark());
        System.out.println("origin = " + jaegerTwo.getOrigin());
        System.out.println("height = " + jaegerTwo.getHeight());
        System.out.println("weight = " + jaegerTwo.getWeight());
        System.out.println("speed = " + jaegerTwo.getSpeed());
        System.out.println("strength = " + jaegerTwo.getStrength());
        System.out.println("armor = " + jaegerTwo.getArmor());
        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
    }
}