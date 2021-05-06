package com.dengmin.demi.threads.threadsafe;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("act-01", 10000);
        AccountThread at1 = new AccountThread(account);
        AccountThread at2 = new AccountThread(account);
        at1.setName("at1");
        at2.setName("ac2");
        at1.start();
        at2.start();
    }
}
