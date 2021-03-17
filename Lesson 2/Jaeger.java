class Jaeger {
    String modelName;
    String mark;
    String origin;
    float height;
    float weight;
    int speed;
    int strength;
    int armor;

    public Jaeger (String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("modelName = %s \nmark = %s \norigin = %s \nheight = %f \nweight = %f \nspeed = %i \nstrength = %i \narmor = %i", modelName, mark, origin, height, weight, speed, strength, armor);
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли пять шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }
}