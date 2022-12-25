package sort.quick;

import java.util.Arrays;

import static sort.common.CommonUtils.lesser;
import static sort.common.CommonUtils.swap;

public class Quicksort {

    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};
        System.out.println("原数组:");
        System.out.println(Arrays.toString(arr));

        quicksort(arr);

        System.out.println("排序后数组:");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 对数组内的元素进行排序
     * 平均时间复杂度为O(nlogn)
     */
    public static void quicksort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        quicksort(a, lo, hi);
    }

    // 对数组a中从索引lo到索引hi之间的元素进行排序
    private static void quicksort(Comparable[] a, int lo, int hi) {
        // 安全性校验
        if (hi <= lo) {
            return;
        }

        // 需要对数组中lo索引到hi索引处的元素进行分组（左子组和右子组）；
        int partition = partition(a, lo, hi);//返回的是分组的分界值所在的索引，分界值位置变换后的索引

        // 让左子组有序
        quicksort(a, lo, partition - 1);

        // 让右子组有序
        quicksort(a, partition + 1, hi);
    }

    //对数组a中，从索引 lo到索引 hi之间的元素进行分组，并返回分组界限对应的索引
    public static int partition(Comparable[] a, int lo, int hi) {
        // 确定分界值
        Comparable key = a[lo];
        // 定义两个指针，分别指向待切分元素的最小索引处和最大索引处的下一个位置
        int left = lo;
        int right = hi + 1;

        // 切分
        while (true) {
            // 先从右往左扫描，移动right指针，找到一个比分界值小的元素，停止
            while (lesser(key, a[--right])) {
                if (right == lo) {
                    break;
                }
            }

            // 再从左往右扫描，移动left指针，找到一个比分界值大的元素，停止
            while (lesser(a[++left], key)) {
                if (left == hi) {
                    break;
                }
            }

            // 判断 left>=right,如果是，则证明元素扫描完毕，结束循环，如果不是，则交换元素即可
            if (left >= right) {
                break;
            } else {
                swap(a, left, right);
            }
        }

        // 交换分界值
        swap(a, lo, right);

        return right;
    }

}
