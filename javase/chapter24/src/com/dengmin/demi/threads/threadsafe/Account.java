package com.dengmin.demi.threads.threadsafe;

public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // 取款的方法
    public void withDraw(double money) {

        /*
         * 用Thread.sleep(1000);模拟网络延迟
         * 用synchronized关键字来实现线程同步机制（线程排队执行）
         * */
        synchronized (this) {
            // 获取当前余额
            double before = this.getBalance();
            // 计算取款后的余额
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
