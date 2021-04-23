package com.dengmin.demi.io;

import java.io.*;
import java.nio.file.Files;

public class FilesCopy01 {
    public static void main(String[] args) {
        File rscFile = new File("D:\\2019资料");
        File densFile = new File("D:\\copy\\");
        copyDir(rscFile, densFile);


    }

    // copy function
    private static void copyDir(File resFile, File densFile) {

//        FileInputStream in = null;
//        FileOutputStream out = null;
//        if(resFile.isFile()) {
//            try {
//                in = new FileInputStream(resFile);
//                String path = (densFile.getAbsolutePath().endsWith("\\") ? densFile.getAbsolutePath() : densFile.getAbsolutePath() + "\\") + resFile.getAbsolutePath().substring(3);
//                out = new FileOutputStream(path);
//
//                // define a Byte[] to put the bytes
//                byte[] bytes = new byte[1024 * 1024];
//                int readCount = 0;
//                // use while instead of if
//                while((readCount = in.read(bytes)) != -1) {
//                    out.write(bytes, 0, readCount);
//                }
//                out.flush();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                if (out != null) {
//                    try {
//                        out.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                if (in != null) {
//                    try {
//                        in.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }

        // get a list of files and directories
        File[] files = resFile.listFiles();
        // looping
        for(File file : files) {
            // get absolutePath

            // cut the absolutePath and add into densPath
            if(file.isFile()) {
                String filePath = file.getAbsolutePath();
                System.out.println(filePath);
//                String densDir = (densFile.getAbsolutePath().endsWith("\\") ? densFile.getAbsolutePath() : densFile.getAbsolutePath() + "\\") + file.getAbsolutePath().substring(3);
//                System.out.println(densDir);
            }

//            if(file.isDirectory()) {
//                String densDir = (densFile.getAbsolutePath().endsWith("\\") ? densFile.getAbsolutePath() : densFile.getAbsolutePath() + "\\") + file.getAbsolutePath().substring(3);
//                File newFile = new File(densDir);
//                if(!(newFile.exists())) {
//                    newFile.mkdirs();
//                }
//            }
            copyDir(file, densFile);
        }

    }
}
