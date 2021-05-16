package com.dengmin.demi.io;

import java.io.*;

public class DataInput_OutputStreamTest01 {
    public static void main(String[] args) {
        // 创建对象
        OutputStream out = null;
        InputStream in = null;
        try {
            in = new FileInputStream("javase/chapter23/src/com/dengmin/demi/io/testOutputFileWriter");
            out = new FileOutputStream("javase/chapter23/src/com/dengmin/demi/io/dataOutputStream");
            DataInputStream dis = new DataInputStream(in);
            DataOutputStream dos = new DataOutputStream(out);
            byte[] bytes = new byte[4];
            int readCount = 0;
            while((readCount = dis.read(bytes)) != -1) {
                String read = new String(bytes, 0, readCount);
                System.out.println(read);
                dos.writeBytes(read);
                dos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
