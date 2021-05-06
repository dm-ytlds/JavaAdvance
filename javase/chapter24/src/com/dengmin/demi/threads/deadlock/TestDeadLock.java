package com.dengmin.demi.threads.deadlock;

public class TestDeadLock {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        MyThread01 mt1 = new MyThread01(obj1, obj2);
        MyThread02 mt2 = new MyThread02(obj1, obj2);
        mt1.setName("mt1");
        mt2.setName("mt2");
        mt1.start();
        mt2.start();
    }
}
// 创建线程类1
class MyThread01 extends Thread {
    Object obj1;
    Object obj2;

    public MyThread01(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    /*
    * 模拟出现死锁，让共享对象在使用对象锁的时候，睡1秒
    * */
    @Override
    public void run() {
        synchronized (obj1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2) {

            }
        }
    }
}
// 创建线程类2
class MyThread02 extends Thread {

    Object obj1;
    Object obj2;

    public MyThread02(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1) {
                System.out.println();
            }
        }
    }
}
