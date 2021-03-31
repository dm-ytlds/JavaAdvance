package com.dengmin.demi.Integer;

/*
 * String int Integer之间的互相转换
 * */
public class Test {
    public static void main(String[] args) {
        // String -->int
        int a = Integer.parseInt("12");
        // int -->String
        String b = String.valueOf(12);
        // int-->Integer（自动装箱）
        Integer c = 12;
        // Integer-->int（自动拆箱）
        int d = c;
        // String-->Integer
        Integer e = Integer.valueOf("11");
        // Integer-->String
        String f = String.valueOf(124);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
