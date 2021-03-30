package com.dengmin.demi.randomNum;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        int i1 = random.nextInt();
        // 不指定范围，就在int的取值范围内输出任意一个数字。
        System.out.println(i1);
        // 指定范围，如101，则产生[0-100]的随机数。不能产生101
        // nextInt：下一个int类型的数据时101，表示最多只能取到100
        int i2 = random.nextInt(101);
        System.out.println(i2);
    }
}
