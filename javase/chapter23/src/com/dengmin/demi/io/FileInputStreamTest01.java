package com.dengmin.demi.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 用.read()方法读取文件中的值。
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        /*
         创建IO文件流对象，传入路径（当然不止这一种传参，可以查看API）
         这是绝对路径，当然也可以用相对路径（但我尝试相对路径时出错了。。。和IDEA默认的当前路径有关。）
         在IDEA中，默认的当前路径是工程（Project）的根
         这里会出现编译时异常，需要进行异常处理
         这一步的处理是方便后面的finally里面的.close()方法可以运行起来（起作用）*/
        FileInputStream file = null;
        try {
            // 文件输入
            // 绝对路径
            // file = new FileInputStream("D:\\2021\\Java\\IdeaProjects\\JavaAdvance\\javase\\chapter23\\src\\com\\dengmin\\demi\\io\\testInputFile");
            // 相对路径
            file = new FileInputStream("javase/chapter23/src/com/dengmin/demi/io/testInputFile");
            // 文件读取，注意：返回的是int类型的值
        /*    while(true) {
                // 默认读取到文件末尾返回值-1.
                if(file.read() == -1) {
                    break;
                }
                System.out.println(file.read());
            }*/
            // 改进while循环的写法
            int readData = 0;
            while((readData = file.read()) != -1) {
                System.out.println(readData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 对流进行关闭
            if(null != file) {
                // 调用的是流对象的方法，所以又要进行异常处理
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
