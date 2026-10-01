package com.team3.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            System.out.println("1. 알바 급여");
            System.out.println("2. 학점 계산");
            System.out.println("3. 통학 교통비");
            System.out.println("4. 동아리 회비 정산");
            System.out.println("0. 종료");
            System.out.println("2. 학점 계산");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();
          
            switch (menu) {               

                case 0: {
                    System.out.println("계산기를 종료합니다.");
                    break;
                }
                case 1: {
                    System.out.print("시급 : ");
                    int hourWage = sc.nextInt();
                    System.out.print("이번 주 근무 시간 : ");
                    int hours = sc.nextInt();

                    WageService money = new WageService();
                    System.out.println(money.makePayslip(hourWage, hours));
                    break;
                }
                case 2: {
                    int score1;
                    int score2;
                    int score3;

                    System.out.println("과목 1 점수:");
                    score1= sc.nextInt();
                    System.out.println("과목 2 점수:");
                    score2= sc.nextInt();
                    System.out.println("과목 3 점수:");
                    score3=sc.nextInt();

                    GradeService grad = new GradeService();
                    String report = grad.makeReport(score1, score2, score3);

                    System.out.println(report);
                    break;
                }
                case 3: {
                    System.out.print("편도 요금 : ");
                    int oneWayFare = sc.nextInt();
                    System.out.print("한 달 등교일 : ");
                    int days = sc.nextInt();
                    System.out.print("정기권 가격 : ");
                    int passPrice = sc.nextInt();
                    CommuteService commuteService = new CommuteService();
                    System.out.println(commuteService.recommend(oneWayFare, days, passPrice));
                    break;
                }
                case 4: {
                    System.out.print("행사 총비용 : ");
                    int tprice = sc.nextInt();

                    System.out.print("참석 인원 : ");
                    int pcount = sc.nextInt();

                    DuesService ds = new DuesService();
                    ds.printSettlement(tprice, pcount);
                    break;
                }
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
                    }
            System.out.println();
        } while (menu != 0);
    }
}
