package com.dengmin.demi.io;

import java.io.*;

/**
 * 测试java.io.BufferedReader相关功能
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        // 创建文件对象
        // FileReader file = null;
        FileInputStream file = null;
        try {
             /*file = new FileReader("Java学习笔记（持续更新中）.md");
             需要一个流文件，所以需要创建一个文件对象传入
             // file属于节点流，bufferedReader属于包装流
             BufferedReader bufferedReader = new BufferedReader(file);
             String firstLine = bufferedReader.readLine();
             // 测试单行输出
             System.out.printf(firstLine);
             // 遍历输出，读取失败，由于文件中有图片，而创建文件对象时用的是纯文件读取方式FileReader，所以应该改为创建FileInputStream字节流
             String s = null;
             while (null != (s = bufferedReader.readLine())) {
                 System.out.printf(s);
             }*/
            file = new FileInputStream("javase/课堂笔记/Java学习笔记（完结）.md");
            // file属于节点流，bis属于包装流
            BufferedInputStream bis = new BufferedInputStream(file);
            // 创建一个数组，大小为文件字节大小
            byte[] bytes = new byte[bis.available()];
            // 读取字节并输出
            int readCount = 0;
            while((readCount = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
