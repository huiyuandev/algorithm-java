package sort.shell;

import java.util.Arrays;

import static sort.common.CommonUtils.greater;
import static sort.common.CommonUtils.swap;

public class ShellSort {

    public static void main(String[] args) {
        Integer[] arr = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        System.out.println("原数组:");
        System.out.println(Arrays.toString(arr));

        // 希尔排序
        shellSort(arr);

        System.out.println("排序后数组:");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 希尔排序
     *
     * @param arr 需要排序的数组
     */
    public static void shellSort(Comparable[] arr) {
        // 根据数组长度，确定增长量h的初始值
        int h = 1;
        while (h < arr.length) {
            h = 2 * h + 1;
        }
        while (h >= 1) {
            // 找到待插入的元素
            for (int i = h; i < arr.length; i++) {
                // 把待插入的元素插入到有序数列中
                for (int j = i; j >= h; j -= h) {
                    // 待插入的元素是arr[j]，比较arr[j]和arr[j-h]
                    if (greater(arr[j - h], arr[j])) {
                        // 大于则交换位置
                        swap(arr, j - h, j);
                    } else {
                        // 待插入的元素已经找到合适的位置，结束循环
                        break;
                    }
                }
            }
            // 减小h的值
            h = h / 2;
        }
    }

}
