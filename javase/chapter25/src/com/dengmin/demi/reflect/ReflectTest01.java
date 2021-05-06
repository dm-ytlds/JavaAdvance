package com.dengmin.demi.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
* 实现反编译效果
* */
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Student student = new Student();
        // 用到字符串拼接
        StringBuffer sb = new StringBuffer();
        // 自定义Class文件
        // Class studentClass = Class.forName("com.dengmin.demi.reflect.Student");
        Class studentClass = Class.forName("java.lang.String");
        // 获取" public class 类名 { "
        sb.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + " {\n");
        Field[] fields = studentClass.getDeclaredFields();
        // 获取" public int no; "
        for(Field field : fields) {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));
            sb.append(" ");
            sb.append(field.getType().getSimpleName());
            sb.append(" ");
            sb.append(field.getName());
            sb.append(";\n");
        }
        sb.append("}\n");
        System.out.println(sb);
    }
}
