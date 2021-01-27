public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        void setSex(char sex) {
            this.sex = 'M';
        }
        void setName(String name) {
            this.name = "White Fang";
        }
        void setWeight(int weight) {
            this.weight = 56;
        }
        void setAge(int age) {
            this.age = 3;
        }
        void setColour(String colour) {
            this.colour = "grey";
        }
        
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