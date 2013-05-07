/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscizzors;

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
    
    private static String genWinReport(int[] wins){
        String toReturn = "";
        int p1 = 0;
        int p2 = 0;
        int draw = 0;
        
        for(int i = 0;i<wins.length;i++){
            if(wins[i]==1){
                p1++;   
            }else if(wins[i]==2){
                p2++;
            }else{
                draw++;
            }
        }
        
        toReturn += "Player1 Wins: "+p1+"\n";
        toReturn += "Player2 Wins: "+p2+"\n";
        toReturn += "Draws: "+draw;
        
        return toReturn;
    }
        
    public static void main(String[] args) {
        
        RPSPlayer p1 = new RatioPlayer();
        RPSPlayer p2 = new RotatingPlayer();
        
        int[] wins = new int[50];
        
        for(int i = 0;i<wins.length;i++){
            wins[i] = getWinner(p1.move(),p2.move());
            p1.result(wins[i]==1);
            p2.result(wins[i]==2);
        }
        
        System.out.println(genWinReport(wins));
    }
}
