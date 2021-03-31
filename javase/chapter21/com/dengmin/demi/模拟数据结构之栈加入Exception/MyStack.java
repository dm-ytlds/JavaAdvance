package com.dengmin.demi.模拟数据结构之栈加入Exception;

public class MyStack {
    // 最多容纳的数组元素
    private static final int MAXSIZE = 10;
    // 创建一个对象来存储数组
    private Object[] elements = new Object[MAXSIZE];
    // 定义一个栈顶指针
    int top;

//    MyStack ms = new MyStack();
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public MyStack() {
        // 在构造方法中初始化栈顶指针
        top = -1;
    }
    public MyStack(Object[] elements) {
        this.elements = elements;
    }
    // 提供push方法
    public void push(Object e) throws MyStackException {
        if(top >= elements.length - 1) {
            // 修改之前
            /*
            System.out.println("栈满了，别输入了>_<'''");
            return;*/
            // 修改之后。new异常对象，属于手动抛出异常信息。这里没必要用到try...catch语句来捕获异常，因为自己new对象，自己抛出没有意义。
            throw new MyStackException("栈满了，别输入了>_<'''");
        }
        // 如果栈未满，则可以添加元素，栈顶指针加1
        top++;
        // 将需要添加的元素添加到数组对象elements中
        elements[top] = e;
        System.out.println("压栈" + e + "成功，栈帧指向：" + top);
    }
    // 提供pop方法
    public Object pop() {
        if(top < 0) {
            MyStackException m = new MyStackException("栈是空的！");
            return m.getMessage();
        }
        // 若栈不是空的，则取出栈顶元素，栈顶指针减1
        return elements[top--];
    }
}
