package com.team3.campus;

public class WageCalculator {
    public int getPay(int wage, int hours){
        return (wage * hours);
    }

    public int getHolidayPay(int wage, int hours){
        return ((wage * hours) / 5);
    }
}
