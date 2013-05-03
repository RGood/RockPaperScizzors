/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscizzors;

import java.util.ArrayList;

/**
 *
 * @author Randy
 */
public class AlwaysRock implements RPSPlayer {

    ArrayList<Boolean> results;
    public AlwaysRock(){
        results = new ArrayList<>();
    }
    
    @Override
    public void result(boolean won) {
        results.add(won);
    }

    @Override
    public int move() {
        return RPSPlayer.ROCK;
    }
}
