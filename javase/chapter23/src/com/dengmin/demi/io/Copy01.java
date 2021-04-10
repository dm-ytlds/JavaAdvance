package com.dengmin.demi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝，用FileInputStream和FileOutputStream，可以拷贝任意类型的文件。视频、声音、图片
 * 拷贝的操作是：一边读，一边写
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 文件路径自己照着切换，fis里面是拷贝的源文件的路径，fos里面是拷贝到目的文件的路径
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\2020.07.22\\论文编写\\SNS平台学术文献交流特征及影响因素分析_张立伟.caj");
            fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\2021\\论文(修改中)\\2021.04.04\\SNS平台学术文献交流特征及影响因素分析_张立伟.caj");
            /*// 初始化一个数组
            byte[] bytes = new byte[1024 * 1024]; // 字节数组的初始空间容量为1MB
            // 先读取，不一定一次就读完了，所以需要有一个暂存每次读取的字节个数的变量readCount。
            // 每读一次，更新一次值，直到没有字节读取，默认返回-1为止。
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1) {
                // 再写入
                fos.write(bytes, 0, readCount);
            }*/
            // 当然可以改上面，在文件中字节不是很多的情况下可以这样改，不建议使用。
            // 去掉循环遍历字节数，直接获取到文件中有多少个字节，然后作为初始化字节数组的容量。
            byte[] bytes = new byte[fis.available()];
            int readCount = fis.read(bytes);
            // 再写入
            fos.write(bytes, 0, readCount);
            // 别忘了刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 分开try...catch,不然一个出错了，会影响另外一个关闭。
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
