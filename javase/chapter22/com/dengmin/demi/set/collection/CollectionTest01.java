package com.dengmin.demi.set.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        // Collection是一个接口，不能创建对象
        // 多态的使用
        Collection c = new ArrayList();
        // 测试Collection接口中的方法
        c.add(120); // （自动装箱）这里的“120”是一个对象，实际上放进去的是一个对象的内存地址。
        c.add(new Object());
        c.add(false);
    }
}
