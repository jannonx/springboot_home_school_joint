package xyz.fusheng.controller;

import xyz.fusheng.common.MD5;

public class Tets {

    public static void main(String[] args) {
        String pass = MD5.MD5Encode("123456");
        System.out.println(pass);
        String pass1 = MD5.MD5Encode("123456");
        System.out.println(pass1);
    }
}
