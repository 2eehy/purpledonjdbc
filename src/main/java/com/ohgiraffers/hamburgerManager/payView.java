package com.ohgiraffers.hamburgerManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class payView {
    public static String burgername="";




    public void singleMemberPay(){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        int listResult =0;


        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/purpledon_query.xml"));
            String query = prop.getProperty("insertOrderList");
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,Pay.price);
            int coupon =(int) (Math.random()*6 + 5);
            pstmt.setInt(2,coupon);
            pstmt.setString(3,Member.name);
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("⭐ 1주년 오픈 이벤트로 5% ~ 10% 회원 전용 랜덤 쿠폰 적용되었습니다. ⭐");
            System.out.println("이벤트 쿠폰 " + coupon + " % 쿠폰 할인 적용되어 총 금액은 " + ( Pay.price /100 *(100-coupon))  + "원 입니다.");
            int finalprice = Pay.price /100 *(100-coupon);
            pstmt.setInt(4,finalprice);
            listResult=pstmt.executeUpdate();
            Pay.price=0;
            System.out.println("최종 결제 완료되었습니다. 👌😁");
            System.out.println("--------------------------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        if(listResult>0){
            System.out.println("List db 추가성공");
        }else{
            System.out.println("list db 추가실패");
        }

    }

    public void setMemberPay(){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        int listResult =0;
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/purpledon_query.xml"));
            String query = prop.getProperty("insertOrderList");
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,Pay.price);
            int coupon =(int) (Math.random()*6 + 5);
            pstmt.setInt(2,coupon);
            int setFinalPay = ( Pay.price /100 *(100-coupon));
            pstmt.setString(3,Member.name);
            pstmt.setInt(4,setFinalPay);
            listResult=pstmt.executeUpdate();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("⭐ 1주년 오픈 이벤트로 5% ~ 10% 회원 전용 랜덤 쿠폰 적용되었습니다. ⭐");
            System.out.println("이벤트 쿠폰 " + coupon + " % 쿠폰 할인 적용되어 " + setFinalPay + " 원 입니다.");
            System.out.println("🙌 세트 할인 1000원이 적용되었습니다. 🙌");
            System.out.println("총 금액은 " + (setFinalPay-1000)  + "원 입니다.");
            Pay.price=0;
            System.out.println("최종 결제 완료되었습니다. 👌😁");
            System.out.println("--------------------------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        if(listResult>0){
            System.out.println("세트메뉴 db 리스트 추가 완료");
        }else{
            System.out.println("추가 실패");
        }


    }


    }

