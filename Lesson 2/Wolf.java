public class Wolf {
    private char sex = 'M';
    private String name = "Mordred";
    private int weight = 70;
    private int age = 4;
    private String colour = "grey";

    public char getSex() {
        return sex;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public String getColour() {
        return colour;
    }

    void setSex(char sex) {
        this.sex = sex;
    }
    void setName(String name) {
        this.name = name;
    }
    void setWeight(int weight) {
        this.weight = weight;
    }
    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else { 
            this.age = age;
        }
    }
    void setColour(String colour) {
        this.colour = colour;
    } 

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void sit() {
        System.out.println(name + " is sitting.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void howl() {
        System.out.println(name + " is howling.");
    }

    public void hunt() {
        System.out.println(name + " is hunting.");
    }

}