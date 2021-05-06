package com.dengmin.demi.threads;

import java.util.ArrayList;
import java.util.List;
/*
* 模拟：生产者和消费者模式
* */
public class ThreadTest04 {
    public static void main(String[] args) {
        // 作为数据仓库，共享对象
        List list = new ArrayList();
//        Producer p = new Producer(list);
//        Consumer c = new Consumer(list);
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));
        t1.setName("Producer");
        t2.setName("Consumer");
        t1.start();
        t2.start();

    }
}

class Producer implements Runnable {
    List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 10) {  // 仓库不为空，有可消费的，就进入等待状态，释放当前锁，让消费者去消费
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName() + ": " + o);
                // 唤醒消费者消费
                list.notify();

            }
        }
    }
}

class Consumer implements Runnable {
    List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) { // 仓库为空，没有可消费的，就进入等待状态，释放当前锁，让生产者去生产
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + ": " + obj);
                // 唤醒生产者生产
                list.notify();
            }
        }
    }
}