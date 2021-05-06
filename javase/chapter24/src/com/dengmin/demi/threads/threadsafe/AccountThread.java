package com.dengmin.demi.threads.threadsafe;

public class AccountThread extends Thread{
    // 两个线程必须共享同一个账户对象
    private Account act;
    public AccountThread(Account act) {
        this.act = act;
    }
    @Override
    public void run() {
        // 模拟取款5000
        double money = 5000;
        act.withDraw(money);
        System.out.println(Thread.currentThread().getName() + "对账户" + act.getActno() + "成功取款：" + money + "，余额：" + act.getBalance());
    }
}
