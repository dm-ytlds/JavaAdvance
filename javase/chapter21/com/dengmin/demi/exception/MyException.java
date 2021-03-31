package com.dengmin.demi.exception;

/**
 * 1.编写一个类继承Exception或者RuntimeException；
 * 2.创建两个构造方法，一个无参数的，一个有参数的(super(s))。
 */
public class MyException extends Exception{
    public MyException() {
    }
    public MyException(String s) {
        super(s);
    }
}
