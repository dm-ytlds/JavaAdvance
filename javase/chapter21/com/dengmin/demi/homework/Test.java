package com.dengmin.demi.homework;

import java.util.Scanner;

public class Test {
    /**
     * 测试用例
     * @param args
     */
    public static void main(String[] args) {
        UserService user = new UserService();
        System.out.print("请输入用户名：");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();
        System.out.print("请输入密码：");
        Scanner s2 = new Scanner(System.in);
        String passwd = s2.next();
        try {
            user.register(name, passwd);
        } catch (UsernameException e) {
            e.printStackTrace();
        }
    }
}
