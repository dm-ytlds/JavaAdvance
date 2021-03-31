package com.dengmin.demi.exception;

/**
 * 调用自己创建的异常Exception类
 */
public class ExceptionTestMyE {
    public static void main(String[] args) {
        MyException myException = new MyException("qwegsdg");
        String s = myException.getMessage();
        System.out.println(s);
        myException.printStackTrace();
    }
}
