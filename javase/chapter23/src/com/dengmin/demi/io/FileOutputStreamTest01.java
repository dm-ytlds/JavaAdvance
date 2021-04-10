package com.dengmin.demi.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * --->java.io.FileOnputStream
 *
 * 	文件字节输出流，负责写。从内存到硬盘。一定记住，要刷新。
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("D:\\2021\\Java\\IdeaProjects\\JavaAdvance\\javase\\chapter23\\src\\com\\dengmin\\demi\\io\\testOutputFile");
            // 单个写入，只能写入单个数字，会自动转换成byte
            file.write(12);
            file.write(32);
            file.write(98);
            // 写入多个，用byte[] 数组
            byte[] bytes = {100,102,103,104,105};
            file.write(bytes);
            // 最后记得要刷新哟
            file.flush();
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
