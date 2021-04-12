package com.dengmin.demi.io.扩展案例之log简单实现;

/**
 * 日志记录简单实现
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public void log(String msg) {
        try {
            // 创建一个标准输出流对象，传入一个字节输出流作为标准输出流的接收对象
            PrintStream ps = new PrintStream(new FileOutputStream("javase/chapter23/src/com/dengmin/demi/io/扩展案例之log简单实现/log.txt", true));
            // System.setOut()方法改变输出方向（不输出在控制台）到log.txt文件中
            System.setOut(ps);
            // 把时间加上。获取事件加入的时间
            Date date = new Date();
            // 格式化时间。
            // 定义格式化形式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
            // 按照上面的形式格式化时间
            String newTime = sdf.format(date);
            // 输出到log.txt文件中
            System.out.println(newTime + ": " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
