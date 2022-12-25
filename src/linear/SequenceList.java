package linear;


import java.util.Iterator;

/**
 * 顺序表
 *
 * @param <T>
 */
public class SequenceList<T> implements Iterable<T> {

    // 存储元素的数组
    private T[] eles;

    // 记录当前顺序表中元素的个数
    private int N;

    /**
     * @param capacity 初始容量
     */
    public SequenceList(int capacity) {
        this.eles = (T[]) new Object[capacity];
        this.N = 0;
    }

    /**
     * 清空
     */
    public void clear() {
        this.N = 0;
    }

    /**
     * 顺序表的长度
     *
     * @return
     */
    public int length() {
        return N;
    }

    /**
     * 获取指定位置处的元素
     *
     * @param i
     * @return
     */
    public T get(int i) {
        return eles[i];
    }

    /**
     * 插入元素（插到末尾）
     *
     * @param t 需要插入的元素
     */
    public void insert(T t) {
        // 扩容
        if (N == eles.length) {
            resize(2 * eles.length);
        }
        eles[N++] = t;
    }

    /**
     * 向指定位置处插入索引
     *
     * @param t 需要插入的元素
     * @param i 需要插入的索引
     */
    public void insert(int i, T t) {
        // 扩容
        if (N == eles.length) {
            resize(2 * eles.length);
        }
        // 先把i索引处的元素及其后面的元素依次向后移动一位
        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        // 再把t放到i索引处即可
        eles[i] = t;
        // 元素个数+1
        N++;
    }

    // 删除指定位置处的元素，并返回该元素
    public T remove(int i) {
        // 记录索引i处的值
        T current = eles[i];
        // 索引i后面的元素依次向前移动一位即可
        for (int index = i; index < N - 1; index++) {
            eles[index] = eles[index + 1];
        }
        // 元素个数-1
        N--;

        // 缩容
        if (N < eles.length / 4) {
            resize(eles.length / 2);
        }

        return current;
    }

    /**
     * 查找t元素第一次出现的位置
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据参数newSize，充值eles的大小
     *
     * @param newSize 新数组长度
     */
    public void resize(int newSize) {
        // 定义一个临时数组指向原数组
        T[] temp = eles;
        // 创建新数组
        eles = (T[]) new Object[newSize];
        // 把原数组的数据拷贝到新数组
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T> {

        private int cursor;

        public SIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < N;
        }

        @Override
        public T next() {
            return eles[cursor++];
        }
    }

}
