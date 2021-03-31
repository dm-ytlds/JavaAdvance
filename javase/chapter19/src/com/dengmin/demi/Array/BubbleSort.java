package src.com.dengmin.demi.Array;
//import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/*
* 冒泡排序算法。
* 在数组array中，每次将第i个元素与第i + 1个元素作比较，若array[i] > array[i + 1],则交换两个数的位置，否则继续向后比较，直到最后一个元素。
* 以上这才是一次排序，总共需要array.length - 1次排序才能将所有元素排完序。
* 例如：array = {1,3,7,9,6,4}
* 第1次参与比较的数据：1,3,7,9,6,4
* 第1次比较得出结果：
*   1,3,7,6,4,9
* 第2次参与比较的数据：1,3,7,6,4
* 第2次比较得出结果：
*   1,3,6,4,7
* 第3次参与比较的数据：1,3,6,4
* 第3次比较得出结果：
*   1,3,4,6
* 第4次参与比较的数据：1,3,4
* 第4次比较得出结果：
*   1,3,4
* 第5次参与比较的数据：1,3
* 第5次比较得出结果：
*   1,3
* 比较结束，得出结果：1, 3, 4, 6, 7, 9
*
* 6个数据，总共比较了5次。
* */
public class BubbleSort {
//    private Arr[] arrays = new Arr[10];

    public static void main(String[] args) {
        // 定义一个静态数组
        int[] array = {1,3,7,9,6,4,5,2,0,8};
        System.out.print("排序之前的数组：[");
        for (int k = 0; k < array.length; k++) {
            if(k == array.length - 1) {
                System.out.print(array[k] + "]");
            }else {
                System.out.print(array[k] + ", ");
            }

        }
        System.out.println();
        BubbleSort bubble = new BubbleSort();
        int[] b = bubble.bubbleSort(array);
        System.out.print("排序之后的数组：[");
        for (int k = 0; k < b.length; k++) {
            if(k == b.length - 1) {
                System.out.print(array[k] + "]");
            }else {
                System.out.print(array[k] + ", ");
            }

        }

    }
    // 冒泡排序方法
    public int[] bubbleSort(int[] array) {
        // 临时变量
        int temp;
        // 遍历数组元素
        /*
            对于外层循环，可以这样理解：
                因为内层循环依赖外层循环，比如外层循环需要循环6次，那么内层循环就需要循环5次。所以采用这种倒序的循环条件，就可以实现冒泡排序的算法。
        */
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
