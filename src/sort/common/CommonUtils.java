package sort.common;

public class CommonUtils {

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
     * 比较元素大小
     *
     * @param a 元素a
     * @param b 元素b
     * @return true：a < b;反之 a > b
     */
    public static boolean lesser(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 交换数组元素位置
     *
     * @param arr 需要交换元素位置的数组
     * @param i   索引i
     * @param j   索引j
     */
    public static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
