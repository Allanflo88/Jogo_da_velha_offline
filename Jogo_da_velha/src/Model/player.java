package Model;

/**
 *
 * @author allan
 */
public class player {
    
    String name;
    int score;

    public player(String name) {
        this.name = name;
        score = 0;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void UpdateScore() {
        score += 1;
    }
    
    
    
}
