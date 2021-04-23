package com.dengmin.demi.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
* 序列化多个对象
* */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        // 创建List对象
        List<Student> list = new ArrayList<>();
        list.add(new Student("111", "zs"));
        list.add(new Student("222", "ls"));
        list.add(new Student("333", "ww"));
        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javase/chapter23/src/com/dengmin/demi/io/students_list"));
        // 序列化
        oos.writeObject(list);
        // 刷新
        oos.flush();
        // 关闭
        oos.close();
    }
}
