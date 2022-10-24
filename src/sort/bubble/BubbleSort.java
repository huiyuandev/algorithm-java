package sort.bubble;

import java.util.Arrays;

import static sort.common.CommonUtils.greater;
import static sort.common.CommonUtils.swap;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] arr = {7, 4, 8, 1, 3, 9};
        System.out.println("原数组:");
        System.out.println(Arrays.toString(arr));

        // 冒泡排序
        bubbleSort(arr);

        System.out.println("排序后数组:");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     * 时间复杂度为O(n^2)
     *
     * @param arr 需要排序的数组
     */
    public static void bubbleSort(Comparable[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(arr[j], arr[j + 1])) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

}
