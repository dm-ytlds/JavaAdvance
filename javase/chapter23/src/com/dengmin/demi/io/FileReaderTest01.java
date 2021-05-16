package com.dengmin.demi.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        // 创建文件对象
        FileReader file = null;
        try {
            file = new FileReader("javase/chapter23/src/com/dengmin/demi/io/testInputFile");
            // 方式一：将读取的文件放在数组里（一次读多个）
            char[] chars = new char[4];
            int readCount = 0;
            while((readCount = file.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 一定要记得释放资源
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
