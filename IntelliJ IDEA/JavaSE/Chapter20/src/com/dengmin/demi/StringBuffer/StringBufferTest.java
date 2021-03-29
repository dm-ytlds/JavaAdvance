package com.dengmin.demi.StringBuffer;
/*
* -->思考：在实际的开发过程中，如果需要进行频繁的字符串拼接，会有什么问题？

	在Java中的字符串是不可变的，每一次拼接都会产生新的字符串。这样会占用大量的方法区内存，造成空间浪费。

		例如： String = "abc";

					s += "hello";

		就以上两行代码，就导致在方法区字符串常量池当中创建了个对象："abc"、"hello"、"abchello"。

	如果需要进行大量的字符串拼接操作，建议使用JDK自带的：java.lang.StringBuffer或者java.lang.StringBuilder
* */
public class StringBufferTest {
    public static void main(String[] args) {
        // 创建一个初始化容量为16的byte[] 数组。（字符串缓冲区对象）当容量超过16，会自动扩容。
        // 当然，也可以手动初设置一个容量。
        StringBuffer stringBuffer = new StringBuffer(100);
         // 拼接字符串，统一调用append()方法。
        stringBuffer.append('a');
        stringBuffer.append(1);
        stringBuffer.append("abc");
        // 输出。自动调用.toString()方法转换成字符串。
        System.out.println(stringBuffer);
    }
}
