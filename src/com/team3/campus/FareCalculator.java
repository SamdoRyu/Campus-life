package com.team3.campus;

public class FareCalculator {
    // 편도 요금 x 2(왕복) x 등교일
    public int getMonthlyFare(int oneWayFare, int days) {
        return oneWayFare * 2 * days;
    }

    // 큰 값에서 작은 값을 뺀 차이
    public int getDifference(int a, int b) {
        return Math.abs(a - b);
    }
}
