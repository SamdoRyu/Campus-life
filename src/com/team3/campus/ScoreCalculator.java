package com.team3.campus;

public class ScoreCalculator {

    public int getSum(int score1, int score2, int score3 ) {
        return score1 + score2 + score3;
    }

    public double getAverage(int sum, int count){
        return (double) sum / count ;
    }
    public int getMin(int score1, int score2, int score3){
        int min = score1;
                if ( score2 < min){
                    min=score2;
                }
                if ( score3 < min) {
                    min= score3;
                }
                return min;
    }

}
