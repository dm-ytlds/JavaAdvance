package com.dengmin.demi.set.map;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        // 创建一个Map对象
        Map<Integer, String> map = new HashMap<>();
        // 向Map中添加键值对
        // 其中“1”实现了自动装箱
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        /* // 获取所有的值，并通过增强for循环进行遍历
        Collection<String> c = map.values();
        for(Object i : c) {
            System.out.println(i);
        }*/
        // 第一种方式：获取所有的key，然后通过key获取所有的值value
        Set<Integer> set = map.keySet();
        Iterator<Integer> keys = set.iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            System.out.println(key + ":" + map.get(key));
        }
        // 第二种方式：Set<Map.Entry<K, V>> entrySet()
        // 把Map集合直接转换成Set集合
        Set<Map.Entry<Integer, String>> kvs = map.entrySet();
        // System.out.println(kvs);
        Iterator<Map.Entry<Integer, String>> it = kvs.iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> kv = it.next();
            System.out.println(kv.getKey() + ":" + kv.getValue());
        }
        // 第二种方式可以写成下面这种foreach 循环
        for (Map.Entry<Integer, String> kv:
             kvs) {
            System.out.println(kv.getKey() + ":" + kv.getValue());
        }

    }
}
