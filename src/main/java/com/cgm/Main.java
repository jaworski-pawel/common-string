package com.cgm;

public class Main {

    public static void main(String[] args) {
        CommonString commonString = new CommonString();
        System.out.println(commonString.getCommonStringLength("jankowalski", "kowal"));
        System.out.println(commonString.getCommonStringLength("janko", "jajko"));
    }
}
