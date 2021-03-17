public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 8);
        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);
        System.out.println("Jaeger One: ");
        System.out.println("modelName = " + jaegerOne.modelName);
        System.out.println("mark = " + jaegerOne.mark);
        System.out.println("origin = " + jaegerOne.origin);
        System.out.println("height = " + jaegerOne.height);
        System.out.println("weight = " + jaegerOne.weight);
        System.out.println("speed = " + jaegerOne.speed);
        System.out.println("strength = " + jaegerOne.strength);
        System.out.println("armor = " + jaegerOne.armor);
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();
        System.out.println("Jaeger Two: ");
        System.out.println("modelName = " + jaegerTwo.modelName);
        System.out.println("mark = " + jaegerTwo.mark);
        System.out.println("origin = " + jaegerTwo.origin);
        System.out.println("height = " + jaegerTwo.height);
        System.out.println("weight = " + jaegerTwo.weight);
        System.out.println("speed = " + jaegerTwo.speed);
        System.out.println("strength = " + jaegerTwo.strength);
        System.out.println("armor = " + jaegerTwo.armor);
        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
    }
}