package com.dengmin.demi.set.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        // 创建集合对象
        Set<Stus> sts = new TreeSet<>(new StusComparator());
        sts.add(new Stus("a", 15));
        sts.add(new Stus("abc", 12));
        sts.add(new Stus("aba", 12));
        sts.add(new Stus("b", 11));
        // 用增强for循环遍历
        for(Stus s : sts) {
            System.out.println(s);
        }
    }
}
// 自定义类
class Stus {
    // 封装
    private String name;
    private int age;

    public Stus(String name, int age) {
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
// 自定义比较器，一定要加上自定义泛型<Stus>
class StusComparator implements Comparator<Stus> {

    @Override
    // 自定义比较方法（即比较规则）
    public int compare(Stus o1, Stus o2) {
        if(o1.getAge() == o2.getAge()) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getAge() - o2.getAge();
        }
    }

}

