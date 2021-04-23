package com.dengmin.demi.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/*
* IO + Properties 联合使用案例。
* userinfo文件可以看成是一个属性配置文件。最好以.properties结尾。
* */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("javase/chapter23/userinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);
        String name = pro.getProperty("username");
        System.out.println(name);
    }

}
