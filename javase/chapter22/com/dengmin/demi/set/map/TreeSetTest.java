package com.dengmin.demi.set.map;

import java.util.Set;
import java.util.TreeSet;

/**
 * 对于自定义类（对象）的情况：TreeSet集合在使用的时候，必须实现Comparable接口，并且需要重写（自定义）比较方法compareTo()的规则。
 *  CompareTo()方法的返回值：
 *
 * 		返回0，表示相同，value会覆盖；
 * 		返回>0，会继续在右子树上查找。
 * 		返回<0，会继续在左子树上查找。
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // 先实例化几个学生对象
        Student s1 = new Student(10, "zs");
        Student s2 = new Student(50, "ls");
        Student s3 = new Student(64, "ww");
        Student s4 = new Student(40, "zl");
        Student s5 = new Student(40, "sq");
        // 实例化TreeSet集合对象
        Set<Student> set = new TreeSet<>();
        // 向集合对象中添加对象
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s2);
        set.add(s5);
        // 在输出的时候，会自动调用重写的compareTo()方法做排序，不需要手动调用
        // 遍历集合中的元素
        for(Student s : set) {
            System.out.println(s);
        }

    }
}
// 用到TreeSet集合时，必须实现Comparable接口才能实现自动排序
// 注意，这里需要用到自定义泛型<Student>来规定集合中对象的数据类型，因为在实例化TreeSet集合对象的时候需要自定义泛型<Student>

/**
 * 实现的功能要求：首先按年龄比较，如果年龄相同，则比较名字是否相同，否则直接比较年龄即可；
 */
class Student implements Comparable<Student>{
    // 封装参数（变量）
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 有参数的构造方法
    public Student(int age) {
        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 重写比较规则
    @Override
    public int compareTo(Student s) {
        // 升序
        // 换过来做运算，就是降序
        if(this.age == s.age) {
            // 可以直接调用String中的compareTo()方法
            return this.name.compareTo(s.name);
        }
        return this.age - s.age;
    }

    @Override
    public String toString() {
        return "[age=" + age + ", name=" + name + "]";
    }
}
