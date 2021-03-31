package com.dengmin.demi.exception;
/*
Java中对异常处理的方式包括两种方式：
	（1）在方法声明的位置使用throws关键字，抛给上级；
	（2）使用try..catch语句进行异常的捕捉。
 */
public class ExceptionTest01 {
    // 第一种异常处理方式：继续上抛，把异常抛给调用者；
    /*
    public static void main(String[] args) throws Exception {
        doSome();
    }*/
    // 第二种异常处理方式：try...catch进行捕捉。
    public static void main(String[] args) {
        try {
            doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void doSome() throws Exception{
        System.out.println("111");
    }
}
