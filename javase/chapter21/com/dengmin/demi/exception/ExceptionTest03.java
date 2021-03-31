package com.dengmin.demi.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try...catch中的finally子句：
 *  一定会执行，通常在finally 语句块中完成资源的释放。
 *
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        // finally子句在try...catch语句执行后一定会执行。
        /*
        例如有以下情况：当创建一个文件流读取对象时，如果文件没有读取到，且在try语句中还存在其他的语句块，就有可能不能正常关闭流，从而可能是程序出错。
         */
        // 将对象创建在外面，便于后面其他语句块的使用
        FileInputStream file = null;
        try {
            file = new FileInputStream("D:\\2021\\Java\\IdeaProjects\\JavaAdvance\\javase\\javase.iml");
            System.out.println(111);
            String s = null;
            // 因为字符串为空，所以必然会出现空指针异常。从而导致后面的 流对象 未关闭成功
//            System.out.println(s.toString());
            System.out.println(222);
            // 放在这里就不会执行，换地方
            // file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {   // 通常在finally 语句块中完成资源的释放
            try {
                if(file != null) {
                    file.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(333);
    }
}
