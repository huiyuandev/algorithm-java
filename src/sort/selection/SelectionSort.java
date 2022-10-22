package sort.selection;

import java.util.Arrays;

import static sort.common.CommonUtils.greater;
import static sort.common.CommonUtils.swap;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] arr = {7, 4, 8, 1, 3, 9};
        System.out.println("原数组:");
        System.out.println(Arrays.toString(arr));

        // 选择排序
        selectionSort(arr);

        System.out.println("排序后数组:");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * 时间复杂度为O(n^2)
     * @param arr 需要排序的数组
     */
    public static void selectionSort(Comparable[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            // 定义变量记录最小元素所在索引，默认为参与排序的第一个元素所在位置
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 需要比较最小索引minIndex处的值和j索引处的值
                if (greater(arr[minIndex], arr[j])) {
                    // 交换索引
                    minIndex = j;
                }
            }
            // 交换最小元素所在索引minIndex处的值和索引i处的值
            swap(arr, i, minIndex);
        }
    }

}
