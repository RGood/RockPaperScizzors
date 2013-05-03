/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscizzors;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Randy
 */
public class RandomMove implements RPSPlayer{
    
    ArrayList<Boolean> results;
    public RandomMove(){
        results = new ArrayList<>();
    }

    @Override
    public void result(boolean won) {
        results.add(won);
    }

    @Override
    public int move() {
        Random rnd = new Random();
        return 1 + rnd.nextInt(3);
    }
    
}
