package com.dengmin.demi.exception;

public class ExceptionTest02 {
    public static void main(String[] args) {
        // 只new一个异常对象，没有将异常对象抛出，JVM会认为这是一个普通的Java对象
        NullPointerException n = new NullPointerException("124rtgg");
        // 调用.getMessage()方法可以将new 的对象传的参数进行输出，即输出构造方法中的参数。
        String s = n.getMessage();
        System.out.println(s);
        // .printStackTrace()方法是打印异常信息。
        n.printStackTrace();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(s);
    }
}
