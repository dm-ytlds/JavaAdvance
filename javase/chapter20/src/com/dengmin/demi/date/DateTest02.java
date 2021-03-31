package src.com.dengmin.demi.date;

/*
 * 获取自1970年1月1日到目前系统时间的总毫秒数。
 * */
public class DateTest02 {
    public static void main(String[] args) {
        // 调用System类中自带的方法currentTimeMillis()，返回以毫秒为单位的当前时间。
        long nowMillis1 = System.currentTimeMillis();
//        System.out.println(nowMillis1);
        for (int i = 0; i < 100000000; i++) {
            System.out.println(i);
        }
        long nowMillis2 = System.currentTimeMillis();
        System.out.println(nowMillis2 - nowMillis1);
    }
}
