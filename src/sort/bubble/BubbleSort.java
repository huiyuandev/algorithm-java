package sort.bubble;

import java.util.Arrays;

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

    /**
     * 比较元素大小
     *
     * @param a 元素a
     * @param b 元素b
     * @return true：a > b;反之 a < b
     */
    public static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 交换数组元素位置
     *
     * @param arr 需要交换元素位置的数组
     * @param i   索引i
     * @param j   索引j
     */
    public static void swap(Comparable[] arr, int i, int j) {
        Comparable temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
