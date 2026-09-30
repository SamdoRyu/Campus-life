package com.team3.campus;

public class DuesService {
    public String getMemberLine(int number, int share, int remainder) {
        if (remainder > 0) {
            if (number == 1) {
                return String.format("%d번(총무) : %d원", number, (share + remainder));
            } else {
                return String.format("%d번 : %d원", number, share);
            }
        } else {
            if (number == 1) {
                return String.format("%d번(총무) : %d원", number, share);
            } else {
                return String.format("%d번 : %d원", number, share);
            }
        }
    }

    public void printSettlement(int total, int people) {
        if (total <= 0 || people <= 0) {
            System.out.println("총비용과 인원은 1 이상이어야 합니다.");
            return;
        }

        DuesCalculator dc = new DuesCalculator();
        int mok = dc.getShare(total, people);
        int remain = dc.getRemainder(total, people);

        if (remain > 0) {
            System.out.printf("나머지가 0보다 크므로 1인당 %d원 (남는 %d원은 총무가 더 냅니다)\n", mok, remain);
        } else {
            System.out.printf("1인당 %d원 (딱 나누어떨어집니다)\n", mok);
        }

        for (int i = 1; i <= people; i++) {
            String line = getMemberLine(i, mok, remain);
            System.out.println(line);
        }
    }

}
