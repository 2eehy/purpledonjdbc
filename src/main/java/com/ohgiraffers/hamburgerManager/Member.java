package com.ohgiraffers.hamburgerManager;

import com.ohgiraffers.hamburgerManage.Dto.memberDTO;
import com.ohgiraffers.hamburgerManage.View.burgerView;
import com.ohgiraffers.hamburgerManage.View.setView;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Member {
    public static String name ;

    burgerView burgerView = new burgerView();
    setView setView = new setView();

    Scanner sc = new Scanner(System.in);
    memberDTO[] memberList = new memberDTO[30];

    {
        memberList[0] = new memberDTO("김정희", "01011112222");
        memberList[1] = new memberDTO("이후영", "01055556666");
        memberList[2] = new memberDTO("이수민", "01077778888");
        memberList[3] = new memberDTO("우리조", "01099998888");
        memberList[4] = new memberDTO("박수쳐", "01012345678");
    }

    int index = 5;

    public void chooseListSingle() {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        int result =0;
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/purpledon_query.xml"));
            String query = prop.getProperty("insertOrderMember");
            pstmt=con.prepareStatement(query);
            System.out.println("회원 검증을 시작합니다.");
            System.out.print("이름을 입력해주세요 : ");
            String str = sc.nextLine();
            System.out.print("핸드폰 번호를 입력해주세요 : ");
            String str2 = sc.nextLine();
            for (memberDTO marr : memberList){

                if(marr==null){
                    System.out.println("---------------------------");;
                    System.out.println("❗ 일치하는 멤버가 없습니다. ❗");
                    regist();
                    burgerView.burgurview();
                    return;
                }

                if(marr.getName().equals(str)) {
                    if (marr.getPhone().equals(str2)) {
                        System.out.println("-------------------------");
                        System.out.println("회원 인증에 성공하였습니다. 😍");
                        pstmt.setString(1, marr.getName());
                        pstmt.setString(2, marr.getPhone());
                        this.name = marr.getName();
                        burgerView.burgurview();
                        return;
                    } else {
                        System.out.println("-------------------------");
                        System.out.println("일치하는 멤버가 없습니다. 회원가입을 진행합니다.");
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }


    }

    public void chooseListSet() {
        System.out.println("-------------------------");
        System.out.println("회원 검증을 시작합니다.");
        System.out.print("이름을 입력해주세요 : ");
        String str = sc.nextLine();
        for (memberDTO marr : memberList){

            if(marr==null){
                System.out.println("---------------------------");;
                System.out.println("❗ 일치하는 맴버가 없습니다. ❗");
                regist();

                return;
            }

            if(marr.getName().equals(str)){
                System.out.println("-------------------------");
                System.out.println("회원 인증에 성공하였습니다. 😍");
                this.name = marr.getName();

                return;
            }

        }

    }

    public void regist() {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        int result =0;
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/purpledon_query.xml"));
            System.out.println("-------------------------");
            System.out.println("-- 회원 가입을 진행합니다. --");
            System.out.println("-------------------------");

            System.out.print(" 성함을 입력하세요 : ");
            String newName = sc.nextLine();

            System.out.print(" 휴대폰 번호를 입력하세요 : ");
            String newPhone = sc.nextLine();

            memberList[index] = new memberDTO(newName, newPhone);
            System.out.println(memberList[index].memberInformation());
            System.out.println("---------------------------------------");
            System.out.println(newName + "님, 회원 가입이 완료되었습니다. 😎");
            System.out.println("---------------------------------------");
            String query = prop.getProperty("insertOrderMember");
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,newName);
            pstmt.setString(2,newPhone);
            result = pstmt.executeUpdate();
            this.name = newName;
//            query =prop.getProperty("insertOrderList");
//            pstmt=con.prepareStatement(query);
//            pstmt.setString(3,newName);
            index++;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }

        if(result>0){
            System.out.println("DB에 맴버추가 완료");

        }else{
            System.out.println("DB에 맴버추가 실패");
        }


    }

}