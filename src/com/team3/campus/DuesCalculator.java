package com.team3.campus;

public class DuesCalculator {
    public int getShare(int total, int people){
        return (total/people);
    }
    public int getRemainder(int total, int people){
        return (total%people);
    }
}
