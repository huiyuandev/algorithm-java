package sort.insertion;

import java.util.Arrays;

import static sort.common.CommonUtils.greater;
import static sort.common.CommonUtils.swap;

public class InsertionSort {

    public static void main(String[] args) {
        Integer[] arr = {7, 4, 8, 1, 3, 9};
        System.out.println("原数组:");
        System.out.println(Arrays.toString(arr));

        // 插入排序
        insertionSort(arr);

        System.out.println("排序后数组:");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序
     * 时间复杂度为O(n^2)
     *
     * @param arr 需要排序的数组
     */
    public static void insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                /**
                 * 倒序遍历
                 * 比较索引j和j-1处的值，如果j-1处的值比j处的值大，则交换数据；
                 * 反之，则找到合适的位置，退出循环
                 */
                if (greater(arr[j - 1], arr[j])) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

}
