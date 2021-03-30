package com.dengmin.demi.designPatterns;

interface IReceiver {
    String getInfo();
}

public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

// 邮件类
class Email implements IReceiver {
    public String getInfo() {
        return "Email!";
    }
}

class WeChat implements IReceiver {
    public String getInfo() {
        return "WeChat!";
    }
}
/*
 * 方式1：简单，容易实现。但问题是不太容易扩展，比如接收其他消息，就需要对代码进行多出修改
 * 引入方式2：加入一个接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖。从而达到良好的扩展性。
 * */

class Person {
    // 接收方法，创建对象，调用方法，依赖接口。
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

