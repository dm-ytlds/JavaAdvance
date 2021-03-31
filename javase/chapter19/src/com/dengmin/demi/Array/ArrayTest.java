package src.com.dengmin.demi.Array;

public class ArrayTest {
    public static void main(String[] args) {
        /* 创建动态数组的方式，创建引用数据类型，默认值为null */
        Object[] obj = new Object[4];
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println("++++++++++++++++++++++++++++");
        int[] s  = new int[7];
        for (int i = 0; i < s.length; i++) {
            s[i] = i;
        }
        /* 调用testArray方法 */
        testArray(s);
        System.out.println("----------------------------");
        /* 如果直接传递一个静态方法创建的数组，需要这样写：new int[]{1,2,3} */
        testArray(new int[]{1, 2, 3});
    }
    public static void testArray(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
