package com.dengmin.demi.threads;
import java.lang.Thread;

/*
* 举例值之创建分支线程
* */
public class ThreadTest01 {
    public static void main(String[] args) {
        // 创建一个线程对象
        MyThread mt = new MyThread();
        //mt.run();    // 直接调用run()方法，不会启动分支线程
        mt.start(); // 创建分支线程，即创建分支栈，随即结束
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程————>:" + i);
        }
    }

}


// 创建一个线程类

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程————>:" + i);
        }
    }
}
