package com.dengmin.demi.threads;
/*
* 实现接口 Runnable 达到多线程
*
* */
import java.lang.Runnable;
public class ThreadTest02 {
    public static void main(String[] args) {
        // 使用匿名内部类的方式实现接口
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t进程：" + i);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程：" + i);
        }
    }
}
