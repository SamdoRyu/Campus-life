package com.team3.campus;

public class WageService {
    public int getHolidayHours(int hours){
        return (hours > 40) ? 40 : hours;
    }

    public String makePayslip(int wage, int hours){
        if (wage <= 0 || hours <= 0) {
            return("시급과 근무 시간은 1 이상이어야 합니다.");
        }
        else if (hours < 15) {
            WageCalculator cal = new WageCalculator();
            return ("기본급 " + (cal.getPay(wage, hours) + "원 (주 15시간 미만이라 주휴수당 없음)"));
        }
        WageCalculator cal = new WageCalculator();
        return ("기본급 " + (cal.getPay(wage, hours) + "원 + 주휴수당 " +
                cal.getHolidayPay(wage, getHolidayHours(hours)) + "원 = 총 "+
                ((cal.getPay(wage, hours) + cal.getHolidayPay(wage, getHolidayHours(hours))) + "원")));
    }
}
