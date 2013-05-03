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
public class AlwaysPaper implements RPSPlayer{
    
    ArrayList<Boolean> results;
    public AlwaysPaper(){
        results = new ArrayList<>();
    }
    
    @Override
    public void result(boolean won) {
        results.add(won);
    }

    @Override
    public int move() {
        return RPSPlayer.PAPER;
    }
}
