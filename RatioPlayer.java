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
public class RatioPlayer implements RPSPlayer{

    ArrayList<Integer> moves;
    ArrayList<Boolean> results;
    
    public RatioPlayer(){
        results = new ArrayList<>();
        moves = new ArrayList<>();
    }
    
    private int bestMove(int rm,int rw, int pm, int pw, int sm, int sw){
        int bestMove = 0;
        ArrayList<Double> move = new ArrayList<>();
        if(rm!=0||rw==0){
            move.add((double)rw/(double)rm);
        }
        if(pm!=0||pw==0){
            move.add((double)pw/(double)pm);
        }
        if(sm!=0||sw==0){
            move.add((double)pw/(double)pm);
        }
        if(move.size()>0){
            for(int i = 0;i<move.size()-1;i++){
                if(move.get(i)<move.get(i+1)){
                    bestMove = i+1;
                }
            }
            return bestMove+1;
        }else{
            return new Random().nextInt(3);
        }
    }
    
    @Override
    public void result(boolean won) {
        results.add(won);
    }

    @Override
    public int move() {
        int rockMoves = 0,rockWins = 0;
        int paperMoves = 0, paperWins = 0;
        int scissorMoves = 0, scissorWins = 0;
        for(int i = 0;i<moves.size();i++){
            if(moves.get(i)==RPSPlayer.ROCK){
                rockMoves++;
                if(results.get(i)){
                    rockWins++;
                }
            }else if(moves.get(i)==RPSPlayer.PAPER){
                paperMoves++;
                if(results.get(i)){
                    paperWins++;
                }
            }else{
                scissorMoves++;
                if(results.get(i)){
                    scissorWins++;
                }
            }
        }
        
        
        return bestMove(rockMoves,rockWins,paperMoves,paperWins,scissorMoves,scissorWins);
    }
    
}
