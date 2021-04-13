import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目要求：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例 1:
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2] 输出: 2
 * 限制：1 <= 数组长度 <= 50000
 */
public class Work01 {
    public static void main(String[] args) {
//        int[] nums = new int[5];
//        // 输入5个数字
//        System.out.println("输入5个数字:");
//        for (int i = 0; i < nums.length; i++) {
//            Scanner scanner = new Scanner(System.in);
//            nums[i] = scanner.nextInt();
//        }
        // 为了方便，直接定义数组
        int[] nums = {6,5,4,4,5,8};
        // test method 1
        // System.out.println(MidElement(nums));
        // test method 2
        // System.out.println(SelectElement(nums));
        // test method 3
        int i = HashElement(nums);
        if(i == -1) {
            System.out.println("没有哪个数字超过数组长度的一半");
        } else {
            System.out.println(i);
        }

    }
    /*
    思路一：将数组nums排序，数组中点的元素一定为众数。
        因为由于数组出现的次数超过一半，排序后，数字从小到大递增，
        不管是数组的左半部分，还是右半部分，都容纳不了超过数组一半的数字，
        所以中间的那个数必然是那个数字。
        时间复杂度是O(logn);空间复杂度：O(nlogn)。
     */
    static int MidElement(int[] a) {
        Arrays.sort(a);
        // 返回数组最中间的数字
        return a[a.length / 2];
    }
    /*
    思路二：选举投票法。
        第一次初始化第一个为优胜者，这个优胜者再次得选票，则票数加1，否则票数减1；
        如果票数抵消到0，那么下一个出现的人重新定义为优胜者，以此类推，直到数组遍历完为止，
        最后一个出现的即为数组中有一个数字出现的次数超过数组长度的一半那个数字。
        时间复杂度：O(n)；空间复杂度：O(1)。
     */
    static int SelectElement(int[] a) {
        // 临时优胜者
        int temp = a[0];
        // 票数统计
        int count = 0;
        for (int num : a) {
            if(count == 0) {
                count++;
                temp = num;

            } else if(num != temp) {
                count--;
            } else if(num == temp){
                count++;
            }
        }
        return temp;
    }
    /*
    思路三：使用hash表。
        使用hash表遍历一次数组，得到每个数字出现的次数，
        然后再遍历map，找到那个出现次数大于数组长度一半的数字。
        时间复杂度：O(n)；空间复杂度：O(n)。
     */
    static int HashElement(int[] a) {
        // Map是接口，需要用到它的实现类来实例化对象
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                // 如果数组中的值出现在map的key中，map中该key对应的value + 1
                // .get()方法返回的是value
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            // 判断数组中是否有数字的个数大于数组长度的一半
            if(map.get(a[i]) > a.length / 2) {
                return a[i];
            }
        }
        // 能执行到这，说明没找到
        return -1;
    }
}
