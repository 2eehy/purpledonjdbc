package com.ohgiraffers.hamburgerManage.View;

import com.ohgiraffers.hamburgerManager.Pay;

import java.util.Scanner;

public class setView {
        Pay pay = new Pay();
  public static String burgersetname;
    public static String drinkname;
    public static String sidename;

    public void burgurviewset() {

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
                System.out.println("-------------------------");
                this.burgersetname = "치즈버거";
                break;
            case "2" : Pay.price += 6000;
                System.out.println("-------------------------");
                System.out.println("불고기버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.burgersetname = "불고기버거";
                break;
            case "3" : Pay.price += 7000;
                System.out.println("-------------------------");
                System.out.println("새우버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.burgersetname = "새우버거";
                break;
            case "4" : Pay.price += 8000;
                System.out.println("-------------------------");
                System.out.println("핫크리스피버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.burgersetname = "핫크리스피버거";
                break;
            case "5" : Pay.price += 9000;
                System.out.println("-------------------------");
                System.out.println("한우버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.burgersetname = "한우버거";
                break;
            default:
                System.out.println("-------------------------");
                System.out.print("알맞은 메뉴를 선택해주세요 ");
                System.out.println();
                burgurviewset();
                break;
        }

    }
    public void sideview() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("--- 1. 치즈스틱 1300원  ---");
        System.out.println("--- 2. 양념감자 3000원  ---");
        System.out.println("--- 3. 코울슬로 3800원  ---");
        System.out.println("--- 4. 웨지 포테이토 3400원-");
        System.out.println("--- 5. 오징어링 1500원  ---");
        System.out.println("-------------------------");
        System.out.print("사이드 메뉴의 번호를 선택해주세요 : ");
        String c = sc.nextLine();


        switch (c){

            case "1" :
                Pay.price += 1300;
                System.out.println("-------------------------");
                System.out.println("치즈스틱를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.sidename = "치즈스틱";
                break;

            case "2" : Pay.price += 3000;
                System.out.println("-------------------------");
                System.out.println("양념감자를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.sidename = "양념감자";
                break;

            case "3" : Pay.price += 3800;
                System.out.println("-------------------------");
                System.out.println("코울슬로를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.sidename = "코울슬로";
                break;
            case "4" : Pay.price += 3400;
                System.out.println("-------------------------");
                System.out.println("웨지 포테이토를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.sidename = "웨지 포테이토";
                break;
            case "5" : Pay.price += 1500;
                System.out.println("-------------------------");
                System.out.println("오징어링을 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.sidename = "오징어링";
                break;
            default:
                System.out.print("알맞은 메뉴를 선택해주세요 ");
                System.out.println();
                sideview();
                break;

        }





    }

    public void drinkview() {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("--- 1. 콜라 2000원     ---");
        System.out.println("--- 2. 사이다 2100원   ----");
        System.out.println("--- 3. 제로콜라 2500원  ---");
        System.out.println("--- 4. 환타 2300원     ---");
        System.out.println("-------------------------");
        System.out.print("음료의 번호를 선택해주세요 : ");

        String c = sc.nextLine();



        switch (c){

            case "1" :
                Pay.price += 2000;
                System.out.println("-------------------------");
                System.out.println("콜라를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.drinkname = "콜라";

                break;
            case "2" : Pay.price += 2100;
                System.out.println("-------------------------");
                System.out.println("사이다를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.drinkname = "사이다";
                break;
            case "3" : Pay.price += 2500;
                System.out.println("-------------------------");
                System.out.println("제로콜라를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.drinkname = "제로콜라";
                break;
            case "4" : Pay.price += 2300;
                System.out.println("-------------------------");
                System.out.println("환타를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                System.out.println("-------------------------");
                this.drinkname = "환타";
                break;

            default:
                System.out.print("알맞은 메뉴를 선택해주세요 ");
                System.out.println();
                drinkview();
                break;

        }





    }


    public String setInformation (){


        return "선택하신 메뉴는 [ 햄버거 = " + this.burgersetname+", 음료 = " + this.drinkname + ", 사이드 = " + this.sidename + "] 입니다.";

    }









}









