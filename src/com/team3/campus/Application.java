package com.team3.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            System.out.println("4. 동아리 회비 정산");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                case 4: {
                    System.out.print("행사 총비용 : ");
                    int tprice = sc.nextInt();

                    System.out.print("참석 인원 : ");
                    int pcount = sc.nextInt();

                    DuesService ds = new DuesService();
                    ds.printSettlement(tprice, pcount);
                    break;
                }
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