package com.ohgiraffers.hamburgerManager;

public class Pay {

    public static int price = 0;

//    Member member = new Member();

    payView payView = new payView();

    public  void BURGERNAME(String burgername, boolean single) {

        if(single == true){
            payView.singleMemberPay();
        }
    }

}
