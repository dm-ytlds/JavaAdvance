package com.dengmin.demi.exception;

/**
 * 面试题：下面方法体中输出的结果是多少？答案：100。
 *
 * 理由：方法体中的代码必须遵循自上而下顺序依次逐行执行！！！
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        int a = m();
        System.out.println(a);
    }
    static int m() {
        int i = 100;
        try {
            return i;
        }finally {
            i++;
        }
    }
}
// 将.class文件进行反编译的代码，可以看见执行顺序
/*
static int m(){
    int i = 100;
    int j = i;
    // 可以看出，i++的确还是在return 语句前面执行，return语句还是最后一个执行的语句，
    // 但多了一个int j = i;语句，且在返回的时候返回的是return j;。
    i++;
    return j;
    // 可能出现异常的处理
    Exception exception;
    exception;
    i++;
    throw exception;
}
*/
