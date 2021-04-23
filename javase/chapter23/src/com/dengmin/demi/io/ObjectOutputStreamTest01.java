package com.dengmin.demi.io;

import java.io.*;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        // 创建对象，实现序列化，对象必须实现 Serializable 接口
        Student student = new Student("123", "zhangsan");

        // 创建对象输出流，首先创建一个文件输出流接收序列化后的文件
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream("javase/chapter23/src/com/dengmin/demi/io/students");
            oos = new ObjectOutputStream(fout);
            // 序列化
            oos.writeObject(student);
            // 刷新
            oos.flush();
            fout.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        // 关闭


    }
}
