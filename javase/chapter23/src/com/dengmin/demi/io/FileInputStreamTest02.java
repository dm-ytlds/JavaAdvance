package com.dengmin.demi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 用int read(byte [])方法进行读取文件，读取的文件放在byte[] 数组中。
 * 通俗理解：相当于将菜放进菜篮子里带回家（IOTest02），而不是将所有的菜一个一个的拿回家（IOTest01）。
 * 下面的例子是不知道文件中有多少字节的情况，定义数组时，估计一个数组大小，用循环遍历出文件中所有的字节。
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            // 写入文件
            file = new FileInputStream("D:\\2021\\Java\\IdeaProjects\\JavaAdvance\\javase\\chapter23\\src\\com\\dengmin\\demi\\io\\testInputFile");
            // 创建一个数组
            byte[] b = new byte[4];
            /*// 读取文件，通过这种方式得到文件的是数量
            int readCount = file.read(b);
            // 将获得的数量用来作为字符串的结尾标识符
            // 将获得的byte文件转换成String字符串
            System.out.println(new String(b, 0, readCount));
            // 读取文件，通过这种方式得到文件的是数量
            readCount = file.read(b);
            // 将获得的数量用来作为字符串的结尾标识符
            // 将获得的byte文件转换成String字符串
            System.out.println(new String(b, 0, readCount));
            // 读取文件，通过这种方式得到文件的是数量
            readCount = file.read(b);
            // 将获得的数量用来作为字符串的结尾标识符
            // 将获得的byte文件转换成String字符串
            System.out.println(new String(b, 0, readCount));
            // 读取文件，通过这种方式得到文件的是数量
            readCount = file.read(b);
            // 将获得的数量用来作为字符串的结尾标识符
            // 将获得的byte文件转换成String字符串
            System.out.println(new String(b, 0, readCount));*/
            // 循环遍历
            int readCount = 0;
            while((readCount = file.read(b)) != -1) {
                System.out.println(new String(b, 0, readCount));
            }

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
