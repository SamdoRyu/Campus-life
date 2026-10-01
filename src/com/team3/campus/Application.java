package com.team3.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("2. 학점 계산");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");

                case 2:
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
            System.out.println();
        } while (menu != 0);
    }
}