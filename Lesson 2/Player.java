public class Player {
    String name;
    int guessNum;

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

    public int getGuessNum() {
        return guessNum;
    }
    void setGuessNum(int guessNum) {
        this.guessNum = guessNum;
    }
}