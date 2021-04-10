package com.dengmin.demi.set.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 使用匿名内部类的方式创建比较器实现比较
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        // 创建集合对象，直接使用匿名内部类的方式创建比较器实现比较（注意：匿名内部类没有类名）。
        Set<Stus_> sts = new TreeSet<>(new Comparator<Stus_>() {
            @Override
            public int compare(Stus_ o1, Stus_ o2) {
                if(o1.getAge() == o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getAge() - o2.getAge();
                }
            }
        });
        sts.add(new Stus_("a", 15));
        sts.add(new Stus_("abc", 12));
        sts.add(new Stus_("aba", 12));
        sts.add(new Stus_("b", 11));
        // 用增强for循环遍历
        for(Stus_ s : sts) {
            System.out.println(s);
        }
    }
}
// 自定义类
class Stus_ {
    // 封装
    private String name;
    private int age;

    public Stus_(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 封装使变量成为了实例变量，其他类调用需要用到setter getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stus{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
