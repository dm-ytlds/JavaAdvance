package com.dengmin.demi.模拟数据结构之栈加入Exception;

import java.util.Scanner;

/*
    编写程序，使用一维数组，模拟栈数据结构。
    要求：
        1.这个站可以存储Java中任何引用数据类型；
        2.在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
        3.在栈中提供pop方法模拟弾栈（栈空了，要有提示信息。）
        4.编写测试程序，new栈对象，调用push pop方法来模拟压栈 弾栈的动作。
*/
public class TestCode {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        // 新创建一个对象压进栈中，这个新对象是我写的Animals类
        // 故意加1，测试栈满的情况
        for (int i = 0; i < ms.getElements().length + 1; i++) {
            System.out.print("请输入动物的名字：");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            /*
            Animals animals = new Animals();
            animals.setName(name);
             */
            try {
                ms.push(new Animals(name).getName());
            } catch (MyStackException e) {
                e.printStackTrace();
            }
        }
        // 故意加1，测试栈空的情况
        for (int j = 0; j < ms.getElements().length + 1; j++) {
            System.out.println(ms.pop());
        }
//        System.out.println(ms.pop());
    }
}
