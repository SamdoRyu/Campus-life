package com.team3.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("3. 통학 교통비");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 3:
                    System.out.print("편도 요금 : ");
                    int oneWayFare = sc.nextInt();
                    System.out.print("한 달 등교일 : ");
                    int days = sc.nextInt();
                    System.out.print("정기권 가격 : ");
                    int passPrice = sc.nextInt();
                    CommuteService commuteService = new CommuteService();
                    System.out.println(commuteService.recommend(oneWayFare, days, passPrice));
                    break;
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}