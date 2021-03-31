package src;

import java.util.Scanner;

/*
    创建对象A,B。用户输入一个数字，来猜测数字是否是预置的数字，并返回猜测结果是否猜对。
*/
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.setNum(100);
        // 这里必须传局部变量a进类B，不然会造成空指针异常。因为如果不传a的话，B中的private A a; 语句中的a就是默认值null。
        B b = new B(a);
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("请输入你要猜的数字：");
            int guessNo = s.nextInt();
            b.guess(guessNo);
        }
    }
}

class A {
    private int num;

    public A() {

    }

    public A(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class B {
    // 重点：因为需要类B猜测类A中的值，所以，可以直接将类A封装给类B
    private A a;

    public B() {

    }

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    // 猜数字的实例方法
    public void guess(int guessNum) {
        // 获取实际的值int realNum = a.getNum();和下面效果一样
        int realNum = this.getA().getNum();

        if (realNum == guessNum) {
            System.out.println("Bingo");
            System.exit(0);
        } else if (realNum > guessNum) {
            System.out.println("猜小了，再试一次");
        } else {
            System.out.println("猜大了，别灰心，再来再来");
        }
    }
}