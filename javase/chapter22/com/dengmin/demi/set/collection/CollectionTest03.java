package com.dengmin.demi.set.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口中contains()方法的使用
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        // 接口不能创建对象，故new了一个ArrayList类的对象
        Collection c = new ArrayList();
        // 添加元素（集合中的元素都是对象）
        c.add(123);
        c.add(3.24);
        c.add(true);
        c.add(new Object());
        String s1 =new String("abc");
        c.add(s1);
        String s2 =new String("abc");
        /* 集合.contains()方法
        （此处的底层会调用String中的.equal()方法，且.equal()方法重写了，所以比较的是两个对象的内容。
        如果是自己写的类，且没有重写equal()方法，则比较的是内存地址，一般都是false。）
            判断集合中是否包含某元素（对象）；
            包含返回true;否则返回false。
         */
        boolean b = c.contains(s2);
        System.out.println(b);
    }
}
