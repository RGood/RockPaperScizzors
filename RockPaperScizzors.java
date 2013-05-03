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
public class RockPaperScizzors {

    /**
     * @param args the command line arguments
     */
    
    private static int getWinner(int move1,int move2){
        if(move1-move2==1||move1-move2==-2){
            return 1;
        }else if(move1-move2==2||move1-move2==-1){
            return 2;
        }
        return 0;
    }
        
    public static void main(String[] args) {
        
        RPSPlayer p1 = new AlwaysPaper();
        RPSPlayer p2 = new AlwaysRock();
        
        int[] wins = new int[50];
        
        for(int i = 0;i<wins.length;i++){
            wins[i] = getWinner(p1.move(),p2.move());
            p1.result(wins[i]==1);
            p2.result(wins[i]==2);
            System.out.println(wins[i]);
        }
    }
}
