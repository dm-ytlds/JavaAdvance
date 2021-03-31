package src.com.dengmin.demi.Array;

public class BinarySortTest {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,22,88,98};
        BinarySortTest binarySortTest = new BinarySortTest();
        int result = binarySortTest.binarySort(arr, 22);
        System.out.println((result == -1) ? "该元素不存在！" :"该元素的下标为：" + result);
    }
    public int binarySort(int[] array, int e) {
        // 定义一个开始下标
        int begin = 0;
        // 定义一个结束下标
        int end = array.length - 1;
        while (begin <= end) {
            // 定义一个中间下标
            int mid = (begin + end) / 2;
            if (array[mid] == e) {
                // 假如中间值等于所要查找的值，说明所要查找的值就是中间值。
                return mid;
            } else if (array[mid] < e) {
                // 假如中间值小于所要查找的值，说明所要查找的值在中间值的右边
                // 开始下标向右移一位，即mid = begin + 1
                begin =mid  + 1;
            } else {
                // 假如中间值大于所要查找的值，说明所要查找的值在中间值的左边
                // 结束下标向左移一位，即mid = end - 1
                end =mid  - 1;
            }

        }
        return -1;
    }
}
