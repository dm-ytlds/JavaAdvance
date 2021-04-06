package com.dengmin.demi.set.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于
 * 集合遍历/迭代专题。
 * Collection的常用方法：
 *
 * 		Collection c = new ArrayList();
 * 		c.add(); //向集合中添加元素
 * 		c.size(); // 集合中元素的个数
 * 		c.clear(); //清空集合元素
 * 		c.contains(Object o); // 集合是否包含元素o
 * *****遍历方式\迭代方式是所有Collection通用的一种方式。在Map集合中不能用，在所有的Collection以及子类中使用。
 * 		Iterator it = c.iterator();
 * 	迭代器Iterator中的hasNext()方法是判断集合中是否还有下一个元素，有返回true，没有就返回false。
 * 	迭代器Iterator中的next()方法是让迭代器前进一位，并且将指向的元素返回。
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        // 主要测试的是Collection接口中的方法
        Collection c = new ArrayList();
        // 添加元素
        c.add(123);
        c.add("abc");
        c.add("def");
        c.add(3.14);
        c.add(true);
        c.add(new Object());
        // 调用迭代器iterator()方法，返回Iterator类型的引用数据类型
        Iterator it = c.iterator();
        /* 遍历/迭代集合中所有的元素，
         运用.hasNext()方法判断是否还有下一个元素
         运用.next()方法在上一步的方法上将下一个元素取出来，并返回Object类型的元素。
         */
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
