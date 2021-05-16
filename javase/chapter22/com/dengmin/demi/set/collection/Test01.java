package com.dengmin.demi.set.collection;

import java.util.*;

/*
* 测试TreeSet集合. 输出的结果会自动排序
* 测试TreeMap集合. key部分会自动排序
* */
public class Test01 {
    public static void main(String[] args) {
        // 测试TreeSet集合. 输出的结果会自动排序
        // 使用泛型，规定集合的类型
        Set<Integer> treeSet = new TreeSet<>();
//        int[] a = {12, 1, 3, 14, 6};

        treeSet.add(12);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(13);
        treeSet.add(5);
        Iterator<Integer> it = treeSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 测试TreeMap集合. key部分会自动排序
        Map<Integer, String> map = new TreeMap<>();
        map.put(12, "a");
        map.put(6, "b");
        map.put(4, "c");
        // 通过keySet()方法获取到键（key）集合
        Set<Integer> keys = map.keySet();
        // 遍历keys
        Iterator<Integer> key = keys.iterator();
        while(key.hasNext()){
            Object obj = key.next();
            System.out.println(obj +": "+ map.get(obj));
        }
        /*
        输出结果：
            4: c
            6: b
            12: a
         */
        // 对于Map集合，还可以处理成Set集合来取键值
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        /*Iterator<Map.Entry<Integer, String>> kvs = set.iterator();
        while(kvs.hasNext()) {
            Map.Entry<Integer, String> kv = kvs.next();
            System.out.println(kv.getKey() + ": " + kv.getValue());
        }*/
        // 或者用增强型for循环：foreach
        for (Map.Entry<Integer, String> kv:
                set) {
            System.out.println(kv.getKey() + ": " + kv.getValue());
        }
    }

}
