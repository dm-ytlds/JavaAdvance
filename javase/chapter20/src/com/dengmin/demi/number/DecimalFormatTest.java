package com.dengmin.demi.number;

import java.text.DecimalFormat;

/*
* 对数字的格式化处理
* 数字的格式有哪些？
    # 代表任意数字；
    , 代表千分位；
    . 代表小数点。
* */
public class DecimalFormatTest {
    public static void main(String[] args) {
        // 加入千分位，保留两位小数
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("###,###.##");
        String sd = decimalFormat.format(12345.244);
        System.out.println(sd);
    }
}
