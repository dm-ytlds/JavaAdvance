package com.dengmin.demi.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    重点掌握：
        通过反射机制调用对象方法。
        反射机制让代码具有通用性。
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass = Class.forName("com.dengmin.demi.reflect.userService");
        // 用反射机制创建一个对象
        Object obj = userServiceClass.newInstance();
//        // 先传参
//        Field[] fields = userServiceClass.getDeclaredFields();
//        for (Field field: fields) {
//            field.set(obj, "admin");
//            field.set(obj, "1234.");
//        }
        // 通过方法名和参数列表调用方法
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        Object reValue = loginMethod.invoke(obj, "admin", "1234");
        System.out.println(reValue);
    }
}
