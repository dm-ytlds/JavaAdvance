package com.dengmin.demi.Array;
/*
* 选择排序。
*   选择从“参与选择的一堆数据”中找出最小值；
*   拿着这个最小值和“参与选择的一堆数据”的第一个元素交换位置。
* */
public class ChooseSort {
    public static void main(String[] args) {
        int[] a = {1,3,7,9,6,4,5,2,8,0};
        System.out.print("选择排序之排序前的数组：[");
        for (int k = 0; k < a.length; k++) {
            if(k == a.length - 1) {
                System.out.print(a[k] + "]");
            }else {
                System.out.print(a[k] + ", ");
            }
        }
        System.out.println();
        ChooseSort choose = new ChooseSort();
        int[] b = choose.chooseSort(a);

        System.out.print("选择排序之排序后的数组：[");
        for (int k = 0; k < b.length; k++) {
            if(k == b.length - 1) {
                System.out.print(b[k] + "]");
            }else {
                System.out.print(b[k] + ", ");
            }

        }
    }
    // 选择排序算法
    public int[] chooseSort(int[] array) {
        /*
        * 外层循环是为了控制比较次数。
        * 内存循环：每次将参与选择的数中最小的数比较出来，然后将最小的数和参与比较的第一个元素交换位置。
        * */
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp;
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;

            }

        }
        return array;
    }
}
