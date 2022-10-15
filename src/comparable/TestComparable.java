package comparable;

public class TestComparable {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小三");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setName("小四");
        s2.setAge(22);

        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

    // 比较取较大值
    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {
            return c1;
        } else {
            return c2;
        }
    }

}
