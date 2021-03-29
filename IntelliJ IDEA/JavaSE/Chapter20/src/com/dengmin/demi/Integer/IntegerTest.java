package com.dengmin.demi.Integer;
/*
* Java中为8中基本数据类型提供了对应的包装类型。8中包装类型属于引用数据类型，父类是Object。为什么需要另写8种包装类？
    答：如果传参时需要传的是对象，那么8种基本数据类型就不能直接传值进去，需要包装成对象才可以用，所以SUN公司写了对应的包装类。
* */
public class IntegerTest {
    public static void main(String[] args) {
        // Integer包装类
        // 基本数据类型-->引用数据类型（装箱）
        // 自动装箱
        Integer i = 12;
        Boolean b = i.equals(2);
        System.out.println(b);
        // 引用数据类型-->基本数据类型（拆箱）
        float f = i.floatValue();
        // 将字符串类型的int数据转换成int。Integer a = new Integer("abc");
        Integer a = Integer.valueOf("124");
        Integer c = Integer.getInteger("124");
        System.out.println(a);
        System.out.println(c);




    }
}
