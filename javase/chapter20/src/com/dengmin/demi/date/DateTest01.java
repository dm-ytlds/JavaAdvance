package com.dengmin.demi.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 日期的处理
 *   1.获取系统当前时间
 *   2.Date--->String
 *   3.String--->Date
 * */
public class DateTest01 {
    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println(nowDate);
        // SimpleDateFormat类可以格式化日期
        // Date转换成String字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(nowDate));
        // String字符串转换成Date类型
        String s = "2021-02-01 08:08:08 888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        try {
            Date date = simpleDateFormat1.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
