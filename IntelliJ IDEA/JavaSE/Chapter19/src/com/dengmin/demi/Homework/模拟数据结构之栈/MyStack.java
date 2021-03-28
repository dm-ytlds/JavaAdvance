package com.dengmin.demi.Homework.模拟数据结构之栈;

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
    public void push(Object e) {
        if(top >= elements.length - 1) {
            System.out.println("栈满了，别输入了>_<'''");
            return;
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
            return "栈是空的！";
        }
        // 若栈不是空的，则取出栈顶元素，栈顶指针减1
        return elements[top--];
    }
}
