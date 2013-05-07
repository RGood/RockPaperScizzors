/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscizzors;

/**
 *
 * @author Randy
 */
public class RotatingPlayer implements RPSPlayer{

    int movesMade;
    
    public RotatingPlayer(){
        movesMade = 0;
    }
    
    @Override
    public void result(boolean won) {
        movesMade++;
    }

    @Override
    public int move() {
        return (movesMade%3)+1;
    }
}
