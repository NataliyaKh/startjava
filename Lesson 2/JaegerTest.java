public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(8);

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
    }

    public static void jaegerTwo(String[] args) {
        Jaeger jaegerTwo = new Jaeger();

        jaegerTwo.setModelName("Crimson Typhoon");
        jaegerTwo.setMark("Mark-4");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.722f);
        jaegerTwo.setSpeed(9);
        jaegerTwo.setStrength(8);
        jaegerTwo.setArmor(6);

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