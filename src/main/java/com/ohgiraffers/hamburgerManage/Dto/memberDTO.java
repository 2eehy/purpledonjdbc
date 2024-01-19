package com.ohgiraffers.hamburgerManage.Dto;

public class memberDTO {

    private String name;    // 회원 이름
    private String phone;   // 휴대폰 번호

    public memberDTO() {}

    public memberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String memberInformation() {
        return "회원 정보 [" +
                " 회원 이름 = " + name +
                ", 휴대폰 번호 = " + phone +
                ']';
    }

}
