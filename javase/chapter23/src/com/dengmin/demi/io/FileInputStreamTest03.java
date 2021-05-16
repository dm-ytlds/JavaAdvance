package com.dengmin.demi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 用int read(byte [])方法进行读取文件，读取的文件放在byte[] 数组中。
 * 通俗理解：相当于将菜放进菜篮子里带回家（IOTest02），而不是将所有的菜一个一个的拿回家（IOTest01）。
 * 可以通过.available()方法得到文件中的字节个数，定义数组时，直接将获得的值放进去，无需遍历，就可以输出文件中所有的字节。
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            // 写入文件
            file = new FileInputStream("D:\\2021\\Java\\IdeaProjects\\JavaAdvance\\javase\\chapter23\\src\\com\\dengmin\\demi\\io\\testInputFile");
            // 获取文件的字节数量
            int bs = file.available();
            // 创建一个数组
            byte[] bytes = new byte[bs];
            // 必须进行读取，才能进行转型，不然字节数组是空的。
            file.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != file) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
