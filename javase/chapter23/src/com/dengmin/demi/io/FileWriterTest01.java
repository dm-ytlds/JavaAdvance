package com.dengmin.demi.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        // 创建文件写的对象
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("javase/chapter23/src/com/dengmin/demi/io/testOutputFileWriter");
            fileWriter.write('a');
            fileWriter.write('b');
            char[] chars = {'c', 'f', '\n',  'v'};
            fileWriter.write(chars);
            fileWriter.append('x');

            // 记得刷新文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
