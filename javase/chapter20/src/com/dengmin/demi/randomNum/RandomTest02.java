package src.com.dengmin.demi.randomNum;

import java.util.Random;

/**
 * 生成五个不同的随机数，并存放到数组中。
 */
public class RandomTest02 {
    public static void main(String[] args) {
        // 准备一个长度为5得我一维数组
        int[] arr = new int[5];
        // 创建随机数实例对象
        Random random = new Random();
        // 因为动态整型数组的默认值都是0，而我们生成的随机数可能为0，所以先给数组整体初始化一个负整数值。
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int index = 0;
        while (index < arr.length) {

            // 产生100以内的随机数
            int num = random.nextInt(101);
            // 假如生成的随机数在数组中不存在。这里需要提出一个判断是否存在的方法
            if (!(isInclude(arr, num))) {
                arr[index++] = num;
            }
        }
        // 输出生成的不重复的随机数
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 判断数组中是否存在该element的方法
     *
     * @param arr     数组
     * @param element 对比的数字
     * @return boolean类型
     */
    public static boolean isInclude(int[] arr, int element) {
        /*
        运用到之前的排序和查找
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, element) >= 0;
        每次排序，程序会出问题。初始值会保存在数组中。
        */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }
}
