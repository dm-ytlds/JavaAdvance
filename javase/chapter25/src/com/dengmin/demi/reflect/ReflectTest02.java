package com.dengmin.demi.reflect;

import java.lang.reflect.Field;

/*
* 使用反射机制给类中的属性赋值。重点！！！
* */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception{
        Student s = new Student();
        //
        Class studentClass = Class.forName("com.dengmin.demi.reflect.Student");
        // 实例化一个student对象(o)
        Object o = studentClass.newInstance();
        // 通过studentClass.getDeclaredField()方法调用相应的Field属性
        Field noFiled = studentClass.getDeclaredField("no");
        // 通过noFiled.set()方法给获取的属性no赋值
        noFiled.set(o, 222);
        // 通过noFiled.get()方法给获取的属性no的值
        System.out.println(noFiled.get(o));

    }
}
