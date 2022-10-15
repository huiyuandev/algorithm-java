package comparable;

/**
 * 定义学生类，通过Comparable接口提供比较规则
 */
public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 按照年龄比较
     *
     * @param other 另一个学生
     * @return int类型比较结果
     */
    @Override
    public int compareTo(Student other) {
        return age - other.age;
    }

}
