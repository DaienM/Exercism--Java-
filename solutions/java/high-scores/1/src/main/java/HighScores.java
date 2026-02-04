import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class HighScores {
    private List <Integer> highScores;
    
    public HighScores(List<Integer> highScores) {
        this.highScores = new ArrayList<>(highScores);
    }
        
    //return all the scores
    public List<Integer> scores() {
        return new ArrayList<>(highScores);
    }
        

    public Integer latest() {
        return highScores.get(highScores.size()-1);
        
       
    }

   public Integer personalBest() {
        return Collections.max(highScores);
        
    }

    List<Integer> personalTopThree() {
        List<Integer> sorted = new ArrayList<>(highScores);
        sorted.sort(Collections.reverseOrder()); //reverse order
        return sorted.subList(0, Math.min(3, sorted.size())); // covers the cases with lists smaller than 3.
        
    }
}
