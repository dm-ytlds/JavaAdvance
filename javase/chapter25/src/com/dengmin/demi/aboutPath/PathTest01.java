package com.dengmin.demi.aboutPath;

import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/*
* 路径获取方式测试
* */
public class PathTest01 {
    public static void main(String[] args) throws Exception{
        // 方式1
        /*InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classInfo.properties");
        Properties p = new Properties();
        p.load(reader);
        reader.close();
        String className = p.getProperty("className");
        System.out.println(className);*/
        // 方式2. 用java.util.ResourceBundle 资源绑定器
        ResourceBundle rb = ResourceBundle.getBundle("classInfo");
        String s = rb.getString("className");
        System.out.println(s);
    }
}
