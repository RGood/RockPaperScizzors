/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscizzors;

/**
 *
 * @author Randy
 */
public interface RPSPlayer {
    final int ROCK = 1;
    final int PAPER = 2;
    final int SCIZZOR = 3;
    
    public void result(boolean won);
    
    public int move();
}
