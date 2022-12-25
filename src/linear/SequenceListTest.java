package linear;

import java.util.ArrayList;

public class SequenceListTest {

    public static void main(String[] args) {
        SequenceList<String> sl = new SequenceList<>(10);
        // 测试插入
        sl.insert("科比");
        sl.insert("艾佛森");
        sl.insert("卡特");
        sl.insert(1, "麦迪");

        for (String s : sl) {
            System.out.println(s);
        }

        System.out.println("--------------------华丽的分割线--------------------------");

        // 测试获取
        String s = sl.get(1);
        System.out.println("索引1处的值为：" + s);

        // 测试删除
        String remove = sl.remove(0);
        System.out.println("移除的元素为：" + remove);

        // 测试清空
        sl.clear();
        System.out.println("清空后顺序表中的元素个数为：" + sl.length());
    }

}
