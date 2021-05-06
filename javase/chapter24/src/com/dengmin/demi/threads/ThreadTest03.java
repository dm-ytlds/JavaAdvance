package com.dengmin.demi.threads;
/*
* 通过修改标记的形式，合理停止进程的运行。
*
* */
public class ThreadTest03 {
    public static void main(String[] args) {
        MyThread03 mt = new MyThread03();
        Thread t = new Thread(mt);
        t.setName("t");
        t.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mt.flag = false;
    }
}
// 创建线程类
class MyThread03 implements Runnable {
    // 打一个标记
    boolean flag = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(flag){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
