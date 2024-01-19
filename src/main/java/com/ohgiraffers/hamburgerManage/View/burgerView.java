package com.ohgiraffers.hamburgerManage.View;

import com.ohgiraffers.hamburgerManager.Pay;


import java.util.Scanner;

import static com.ohgiraffers.hamburgerManager.payView.burgername;

public class burgerView {

    Pay pay = new Pay();
    public void burgurview() {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.println("--- 1. 치즈버거 5000원  ---");
            System.out.println("--- 2. 불고기버거 6000원 --");
            System.out.println("--- 3. 새우버거 7000원   --");
            System.out.println("--- 4. 핫크리스피버거 8000원");
            System.out.println("--- 5. 한우버거 9000원   --");
            System.out.println("-------------------------");
            System.out.print("햄버거의 번호를 선택해주세요 : ");
            String c = sc.nextLine();

            switch (c){

                case "1" :
                    Pay.price += 5000;
                    System.out.println("-------------------------");
                    System.out.println("치즈버거를 선택하셨습니다.");
                    System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                    burgername = "치즈버거";
                    System.out.println("-------------------------");
                    pay.BURGERNAME("치즈버거",true);
                    break;
                case "2" : Pay.price += 6000;
                    System.out.println("-------------------------");
                    System.out.println("불고기버거");
                    System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                    burgername = "불고기버거";
                    System.out.println("-------------------------");
                    pay.BURGERNAME("불고기버거",true);
                    break;
                case "3" : Pay.price += 7000;
                    System.out.println("-------------------------");
                    System.out.println("새우버거");
                    burgername = "새우버거";
                    System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                    System.out.println("-------------------------");
                    pay.BURGERNAME("새우버거",true);
                    break;
                case "4" : Pay.price += 8000;
                    System.out.println("-------------------------");
                    System.out.println("핫크리스피버거");
                    burgername = "핫크리스피버거";
                    System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                    System.out.println("-------------------------");
                    pay.BURGERNAME("핫크리스피버거",true);
                    break;
                case "5" : Pay.price += 9000;
                    System.out.println("-------------------------");
                    System.out.println("한우버거");
                    burgername = "한우버거";
                    System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                    System.out.println("-------------------------");
                    pay.BURGERNAME("한우버거",true);
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("알맞은 메뉴를 선택해주세요 ");
                    System.out.println("-------------------------");
                    burgurview();
                    System.out.println(); break;
            }

        }

    }




