public class Player {
    String name;
    int guessNum;
    boolean compare;

    public Player () {
        name = "";
        guessNum = 0;
    }
    
    public Player (String name, int guessNum) {
        this.name = name;
        this.guessNum = guessNum;
    }

    public String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    public static int getGuessNum() {
        return guessNum;
    }
    void setGuessNum(int guessNum) {
        this.guessNum = guessNum;
    }

    public boolean getCompare() {
        return compare;
    }
    void setCompare(boolean compare) {
        this.compare = compare;
    }
}