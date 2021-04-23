package com.dengmin.demi.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javase/chapter23/src/com/dengmin/demi/io/students_list"));
        // 读取
        List<Student> lis = (List<Student>)ois.readObject();
        for(Student s : lis) {
            System.out.println(s);
        }
        ois.close();
    }
}
